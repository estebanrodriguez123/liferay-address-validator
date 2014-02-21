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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AddressProcessingTools. This utility wraps
 * {@link com.rivetlogic.address.service.impl.AddressProcessingToolsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Rivet Logic
 * @see AddressProcessingToolsLocalService
 * @see com.rivetlogic.address.service.base.AddressProcessingToolsLocalServiceBaseImpl
 * @see com.rivetlogic.address.service.impl.AddressProcessingToolsLocalServiceImpl
 * @generated
 */
public class AddressProcessingToolsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.address.service.impl.AddressProcessingToolsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
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
	public static java.util.List<com.rivetlogic.address.model.Address> matchAddress(
		com.rivetlogic.address.model.Address address) {
		return getService().matchAddress(address);
	}

	/**
	* Return a JSON Array of address matching the input. If the address is
	* complete enough and valid, this list should have just one element. An
	* empty list will means the direction is wrong.
	*
	* @param address
	* @return JSON Array of address matching the input
	*/
	public static com.liferay.portal.kernel.json.JSONArray matchAddressAsJSON(
		com.rivetlogic.address.model.Address address) {
		return getService().matchAddressAsJSON(address);
	}

	/**
	* @return name of the current validation API
	*/
	public static java.lang.String getCurrentValidationAPIName() {
		return getService().getCurrentValidationAPIName();
	}

	public static void clearService() {
		_service = null;
	}

	public static AddressProcessingToolsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AddressProcessingToolsLocalService.class.getName());

			if (invokableLocalService instanceof AddressProcessingToolsLocalService) {
				_service = (AddressProcessingToolsLocalService)invokableLocalService;
			}
			else {
				_service = new AddressProcessingToolsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AddressProcessingToolsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AddressProcessingToolsLocalService service) {
	}

	private static AddressProcessingToolsLocalService _service;
}