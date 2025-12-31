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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessInstanceInfo extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例类型VPC or DIRECTCONNECT等类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例所在地域
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 接入防火墙的网段模式：0-不接入，1-接入实例关联的所有网段，2-接入用户自定义的网段
    */
    @SerializedName("AccessCidrMode")
    @Expose
    private Long AccessCidrMode;

    /**
    * 接入防火墙的网段列表
    */
    @SerializedName("AccessCidrList")
    @Expose
    private String [] AccessCidrList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例类型VPC or DIRECTCONNECT等类型 
     * @return InstanceType 实例类型VPC or DIRECTCONNECT等类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型VPC or DIRECTCONNECT等类型
     * @param InstanceType 实例类型VPC or DIRECTCONNECT等类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例所在地域 
     * @return InstanceRegion 实例所在地域
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 实例所在地域
     * @param InstanceRegion 实例所在地域
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 接入防火墙的网段模式：0-不接入，1-接入实例关联的所有网段，2-接入用户自定义的网段 
     * @return AccessCidrMode 接入防火墙的网段模式：0-不接入，1-接入实例关联的所有网段，2-接入用户自定义的网段
     */
    public Long getAccessCidrMode() {
        return this.AccessCidrMode;
    }

    /**
     * Set 接入防火墙的网段模式：0-不接入，1-接入实例关联的所有网段，2-接入用户自定义的网段
     * @param AccessCidrMode 接入防火墙的网段模式：0-不接入，1-接入实例关联的所有网段，2-接入用户自定义的网段
     */
    public void setAccessCidrMode(Long AccessCidrMode) {
        this.AccessCidrMode = AccessCidrMode;
    }

    /**
     * Get 接入防火墙的网段列表 
     * @return AccessCidrList 接入防火墙的网段列表
     */
    public String [] getAccessCidrList() {
        return this.AccessCidrList;
    }

    /**
     * Set 接入防火墙的网段列表
     * @param AccessCidrList 接入防火墙的网段列表
     */
    public void setAccessCidrList(String [] AccessCidrList) {
        this.AccessCidrList = AccessCidrList;
    }

    public AccessInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessInstanceInfo(AccessInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.AccessCidrMode != null) {
            this.AccessCidrMode = new Long(source.AccessCidrMode);
        }
        if (source.AccessCidrList != null) {
            this.AccessCidrList = new String[source.AccessCidrList.length];
            for (int i = 0; i < source.AccessCidrList.length; i++) {
                this.AccessCidrList[i] = new String(source.AccessCidrList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "AccessCidrMode", this.AccessCidrMode);
        this.setParamArraySimple(map, prefix + "AccessCidrList.", this.AccessCidrList);

    }
}

