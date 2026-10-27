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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceBasicAttributeRequest extends AbstractModel {

    /**
    * 云桌面实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改云桌面实例的属性信息
    */
    @SerializedName("AttributeInfoList")
    @Expose
    private AttributeInfo [] AttributeInfoList;

    /**
     * Get 云桌面实例id 
     * @return InstanceId 云桌面实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云桌面实例id
     * @param InstanceId 云桌面实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 修改云桌面实例的属性信息 
     * @return AttributeInfoList 修改云桌面实例的属性信息
     */
    public AttributeInfo [] getAttributeInfoList() {
        return this.AttributeInfoList;
    }

    /**
     * Set 修改云桌面实例的属性信息
     * @param AttributeInfoList 修改云桌面实例的属性信息
     */
    public void setAttributeInfoList(AttributeInfo [] AttributeInfoList) {
        this.AttributeInfoList = AttributeInfoList;
    }

    public ModifyInstanceBasicAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceBasicAttributeRequest(ModifyInstanceBasicAttributeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AttributeInfoList != null) {
            this.AttributeInfoList = new AttributeInfo[source.AttributeInfoList.length];
            for (int i = 0; i < source.AttributeInfoList.length; i++) {
                this.AttributeInfoList[i] = new AttributeInfo(source.AttributeInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "AttributeInfoList.", this.AttributeInfoList);

    }
}

