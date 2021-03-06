/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.ide.ui.liferay.util;

import com.liferay.ide.ui.swtbot.util.StringPool;

/**
 * @author Terry Jia
 */
public class SdkInfo {

	public String getSdkDir() {
		return _sdkDir;
	}

	public String getSdkZip() {
		return _sdkZip;
	}

	public String getVersion() {
		return _version;
	}

	public void setSdkDir(String sdkDir) {
		_sdkDir = sdkDir;
	}

	public void setSdkZip(String sdkZip) {
		_sdkZip = sdkZip;
	}

	public void setVersion(String version) {
		_version = version;
	}

	private String _sdkDir = StringPool.BLANK;
	private String _sdkZip = StringPool.BLANK;
	private String _version = StringPool.BLANK;

}