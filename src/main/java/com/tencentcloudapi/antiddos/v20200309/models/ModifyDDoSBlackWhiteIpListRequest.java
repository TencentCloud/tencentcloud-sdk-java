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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSBlackWhiteIpListRequest extends AbstractModel{

    /**
    * 资源Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 当前黑名单类型，取值black时黑名单；取值white时白名单
    */
    @SerializedName("OldIpType")
    @Expose
    private String OldIpType;

    /**
    * 当前配置的Ip段，包含ip与掩码
    */
    @SerializedName("OldIp")
    @Expose
    private IpSegment OldIp;

    /**
    * 修改后黑白名单类型，取值black时黑名单，取值white时白名单
    */
    @SerializedName("NewIpType")
    @Expose
    private String NewIpType;

    /**
    * 当前配置的Ip段，包含ip与掩码
    */
    @SerializedName("NewIp")
    @Expose
    private IpSegment NewIp;

    /**
     * Get 资源Id 
     * @return InstanceId 资源Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源Id
     * @param InstanceId 资源Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 当前黑名单类型，取值black时黑名单；取值white时白名单 
     * @return OldIpType 当前黑名单类型，取值black时黑名单；取值white时白名单
     */
    public String getOldIpType() {
        return this.OldIpType;
    }

    /**
     * Set 当前黑名单类型，取值black时黑名单；取值white时白名单
     * @param OldIpType 当前黑名单类型，取值black时黑名单；取值white时白名单
     */
    public void setOldIpType(String OldIpType) {
        this.OldIpType = OldIpType;
    }

    /**
     * Get 当前配置的Ip段，包含ip与掩码 
     * @return OldIp 当前配置的Ip段，包含ip与掩码
     */
    public IpSegment getOldIp() {
        return this.OldIp;
    }

    /**
     * Set 当前配置的Ip段，包含ip与掩码
     * @param OldIp 当前配置的Ip段，包含ip与掩码
     */
    public void setOldIp(IpSegment OldIp) {
        this.OldIp = OldIp;
    }

    /**
     * Get 修改后黑白名单类型，取值black时黑名单，取值white时白名单 
     * @return NewIpType 修改后黑白名单类型，取值black时黑名单，取值white时白名单
     */
    public String getNewIpType() {
        return this.NewIpType;
    }

    /**
     * Set 修改后黑白名单类型，取值black时黑名单，取值white时白名单
     * @param NewIpType 修改后黑白名单类型，取值black时黑名单，取值white时白名单
     */
    public void setNewIpType(String NewIpType) {
        this.NewIpType = NewIpType;
    }

    /**
     * Get 当前配置的Ip段，包含ip与掩码 
     * @return NewIp 当前配置的Ip段，包含ip与掩码
     */
    public IpSegment getNewIp() {
        return this.NewIp;
    }

    /**
     * Set 当前配置的Ip段，包含ip与掩码
     * @param NewIp 当前配置的Ip段，包含ip与掩码
     */
    public void setNewIp(IpSegment NewIp) {
        this.NewIp = NewIp;
    }

    public ModifyDDoSBlackWhiteIpListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSBlackWhiteIpListRequest(ModifyDDoSBlackWhiteIpListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldIpType != null) {
            this.OldIpType = new String(source.OldIpType);
        }
        if (source.OldIp != null) {
            this.OldIp = new IpSegment(source.OldIp);
        }
        if (source.NewIpType != null) {
            this.NewIpType = new String(source.NewIpType);
        }
        if (source.NewIp != null) {
            this.NewIp = new IpSegment(source.NewIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldIpType", this.OldIpType);
        this.setParamObj(map, prefix + "OldIp.", this.OldIp);
        this.setParamSimple(map, prefix + "NewIpType", this.NewIpType);
        this.setParamObj(map, prefix + "NewIp.", this.NewIp);

    }
}

