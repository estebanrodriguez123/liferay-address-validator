/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.address.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddressProcessingToolsLocalService}.
 *
 * @author Rivet Logic
 * @see AddressProcessingToolsLocalService
 * @generated
 */
public class AddressProcessingToolsLocalServiceWrapper
	implements AddressProcessingToolsLocalService,
		ServiceWrapper<AddressProcessingToolsLocalService> {
	public AddressProcessingToolsLocalServiceWrapper(
		AddressProcessingToolsLocalService addressProcessingToolsLocalService) {
		_addressProcessingToolsLocalService = addressProcessingToolsLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _addressProcessingToolsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_addressProcessingToolsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _addressProcessingToolsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Return a list of address matching the input. If the address is complete
	* enough and valid, this list should have just one element. An empty list
	* will means the direction is wrong.
	*
	* @param address
	to match
	* @return List of addresses matching the input
	*/
	@Override
	public java.util.List<com.rivetlogic.address.model.Address> matchAddress(
		com.rivetlogic.address.model.Address address) {
		return _addressProcessingToolsLocalService.matchAddress(address);
	}

	/**
	* Return a JSON Array of address matching the input. If the address is
	* complete enough and valid, this list should have just one element. An
	* empty list will means the direction is wrong.
	*
	* @param address
	* @return JSON Array of address matching the input
	*/
	@Override
	public com.liferay.portal.kernel.json.JSONArray matchAddressAsJSON(
		com.rivetlogic.address.model.Address address) {
		return _addressProcessingToolsLocalService.matchAddressAsJSON(address);
	}

	/**
	* @return name of the current validation API
	*/
	@Override
	public java.lang.String getCurrentValidationAPIName() {
		return _addressProcessingToolsLocalService.getCurrentValidationAPIName();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AddressProcessingToolsLocalService getWrappedAddressProcessingToolsLocalService() {
		return _addressProcessingToolsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAddressProcessingToolsLocalService(
		AddressProcessingToolsLocalService addressProcessingToolsLocalService) {
		_addressProcessingToolsLocalService = addressProcessingToolsLocalService;
	}

	@Override
	public AddressProcessingToolsLocalService getWrappedService() {
		return _addressProcessingToolsLocalService;
	}

	@Override
	public void setWrappedService(
		AddressProcessingToolsLocalService addressProcessingToolsLocalService) {
		_addressProcessingToolsLocalService = addressProcessingToolsLocalService;
	}

	private AddressProcessingToolsLocalService _addressProcessingToolsLocalService;
}