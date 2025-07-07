/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAndroidInstancesPropertiesRequest extends AbstractModel {

    /**
    * 安卓实例 ID 列表
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 安卓实例设备
    */
    @SerializedName("AndroidInstanceDevice")
    @Expose
    private AndroidInstanceDevice AndroidInstanceDevice;

    /**
    * 安卓实例其它属性列表
    */
    @SerializedName("AndroidInstanceProperties")
    @Expose
    private AndroidInstanceProperty [] AndroidInstanceProperties;

    /**
     * Get 安卓实例 ID 列表 
     * @return AndroidInstanceIds 安卓实例 ID 列表
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 安卓实例 ID 列表
     * @param AndroidInstanceIds 安卓实例 ID 列表
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 安卓实例设备 
     * @return AndroidInstanceDevice 安卓实例设备
     */
    public AndroidInstanceDevice getAndroidInstanceDevice() {
        return this.AndroidInstanceDevice;
    }

    /**
     * Set 安卓实例设备
     * @param AndroidInstanceDevice 安卓实例设备
     */
    public void setAndroidInstanceDevice(AndroidInstanceDevice AndroidInstanceDevice) {
        this.AndroidInstanceDevice = AndroidInstanceDevice;
    }

    /**
     * Get 安卓实例其它属性列表 
     * @return AndroidInstanceProperties 安卓实例其它属性列表
     */
    public AndroidInstanceProperty [] getAndroidInstanceProperties() {
        return this.AndroidInstanceProperties;
    }

    /**
     * Set 安卓实例其它属性列表
     * @param AndroidInstanceProperties 安卓实例其它属性列表
     */
    public void setAndroidInstanceProperties(AndroidInstanceProperty [] AndroidInstanceProperties) {
        this.AndroidInstanceProperties = AndroidInstanceProperties;
    }

    public ModifyAndroidInstancesPropertiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstancesPropertiesRequest(ModifyAndroidInstancesPropertiesRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.AndroidInstanceDevice != null) {
            this.AndroidInstanceDevice = new AndroidInstanceDevice(source.AndroidInstanceDevice);
        }
        if (source.AndroidInstanceProperties != null) {
            this.AndroidInstanceProperties = new AndroidInstanceProperty[source.AndroidInstanceProperties.length];
            for (int i = 0; i < source.AndroidInstanceProperties.length; i++) {
                this.AndroidInstanceProperties[i] = new AndroidInstanceProperty(source.AndroidInstanceProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamObj(map, prefix + "AndroidInstanceDevice.", this.AndroidInstanceDevice);
        this.setParamArrayObj(map, prefix + "AndroidInstanceProperties.", this.AndroidInstanceProperties);

    }
}

