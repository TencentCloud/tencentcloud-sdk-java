/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateReflectSequenceRequest extends AbstractModel{

    /**
    * SDK生成的打包数据的资源链接。
    */
    @SerializedName("DeviceDataUrl")
    @Expose
    private String DeviceDataUrl;

    /**
    * SDK生成的打包数据的MD5值。
    */
    @SerializedName("DeviceDataMd5")
    @Expose
    private String DeviceDataMd5;

    /**
    * 1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
     * Get SDK生成的打包数据的资源链接。 
     * @return DeviceDataUrl SDK生成的打包数据的资源链接。
     */
    public String getDeviceDataUrl() {
        return this.DeviceDataUrl;
    }

    /**
     * Set SDK生成的打包数据的资源链接。
     * @param DeviceDataUrl SDK生成的打包数据的资源链接。
     */
    public void setDeviceDataUrl(String DeviceDataUrl) {
        this.DeviceDataUrl = DeviceDataUrl;
    }

    /**
     * Get SDK生成的打包数据的MD5值。 
     * @return DeviceDataMd5 SDK生成的打包数据的MD5值。
     */
    public String getDeviceDataMd5() {
        return this.DeviceDataMd5;
    }

    /**
     * Set SDK生成的打包数据的MD5值。
     * @param DeviceDataMd5 SDK生成的打包数据的MD5值。
     */
    public void setDeviceDataMd5(String DeviceDataMd5) {
        this.DeviceDataMd5 = DeviceDataMd5;
    }

    /**
     * Get 1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认） 
     * @return SecurityLevel 1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set 1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
     * @param SecurityLevel 1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    public GenerateReflectSequenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateReflectSequenceRequest(GenerateReflectSequenceRequest source) {
        if (source.DeviceDataUrl != null) {
            this.DeviceDataUrl = new String(source.DeviceDataUrl);
        }
        if (source.DeviceDataMd5 != null) {
            this.DeviceDataMd5 = new String(source.DeviceDataMd5);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new String(source.SecurityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceDataUrl", this.DeviceDataUrl);
        this.setParamSimple(map, prefix + "DeviceDataMd5", this.DeviceDataMd5);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);

    }
}

