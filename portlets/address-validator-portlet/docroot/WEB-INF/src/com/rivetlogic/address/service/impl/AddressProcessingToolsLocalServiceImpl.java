/*
 * Copyright (C) 2005-2014 Rivet Logic Corporation.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */

package com.rivetlogic.address.service.impl;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rivetlogic.address.model.Address;
import com.rivetlogic.address.service.base.AddressProcessingToolsLocalServiceBaseImpl;
import com.rivetlogic.address.util.AddressUtil;
import com.rivetlogic.address.validation.AddressValidator;
import com.rivetlogic.address.validation.AddressValidatorFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the address processing tools local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.rivetlogic.address.service.AddressProcessingToolsLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author katalina marcos
 * @see com.rivetlogic.address.service.base.AddressProcessingToolsLocalServiceBaseImpl
 * @see com.rivetlogic.address.service.AddressProcessingToolsLocalServiceUtil
 */
public class AddressProcessingToolsLocalServiceImpl extends AddressProcessingToolsLocalServiceBaseImpl {
    
    private static final Log _log = LogFactoryUtil.getLog(AddressProcessingToolsLocalServiceImpl.class);
    
    /*
     * NOTE FOR DEVELOPERS:
     * 
     * Never reference this interface directly. Always use {@link
     * com.rivetlogic.address.service.AddressProcessingToolsLocalServiceUtil} to
     * access the address processing tools local service.
     */
    
    /***
     * Return a list of address matching the input. If the address is complete
     * enough and valid, this list should have just one element. An empty list
     * will means the direction is wrong.
     * 
     * @param address
     *            to match
     * @return List of addresses matching the input
     */
    public List<Address> matchAddress(Address address) {
        
        AddressValidator validator = AddressValidatorFactory.getAddressValidator();
        
        List<Address> matchedAddresses;
        try {
            matchedAddresses = validator.validateAddress(address);
        } catch (Exception e) {
            matchedAddresses = new ArrayList<Address>();
            _log.warn(e);
        }
        
        return matchedAddresses;
    }
    
    /**
     * Return a JSON Array of address matching the input. If the address is
     * complete enough and valid, this list should have just one element. An
     * empty list will means the direction is wrong.
     * 
     * @param address
     * @return JSON Array of address matching the input
     */
    public JSONArray matchAddressAsJSON(Address address) {
        List<Address> addresses = matchAddress(address);
        
        JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
        for (Address oneAddress : addresses) {
            jsonArray.put(AddressUtil.addressToJSONObject(oneAddress));
        }
        return jsonArray;
    }
    
    /**
     * @return name of the current validation API
     */
    public String getCurrentValidationAPIName(){
        return AddressValidatorFactory.getCurrentValidationAPI();
    }
    
}