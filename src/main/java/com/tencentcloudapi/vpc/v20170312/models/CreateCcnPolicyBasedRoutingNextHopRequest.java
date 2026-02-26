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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCcnPolicyBasedRoutingNextHopRequest extends AbstractModel {

    /**
    * 云联网ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 下一跳地域
    */
    @SerializedName("NextHopRegion")
    @Expose
    private String NextHopRegion;

    /**
    * 关联实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 下一跳资源类型[HAVIP, GWLB_ENDPOINT]]
    */
    @SerializedName("NextHopResourceType")
    @Expose
    private String NextHopResourceType;

    /**
    * 下一跳资源ID
    */
    @SerializedName("NextHopResourceId")
    @Expose
    private String NextHopResourceId;

    /**
     * Get 云联网ID 
     * @return CcnId 云联网ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID
     * @param CcnId 云联网ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 下一跳地域 
     * @return NextHopRegion 下一跳地域
     */
    public String getNextHopRegion() {
        return this.NextHopRegion;
    }

    /**
     * Set 下一跳地域
     * @param NextHopRegion 下一跳地域
     */
    public void setNextHopRegion(String NextHopRegion) {
        this.NextHopRegion = NextHopRegion;
    }

    /**
     * Get 关联实例ID 
     * @return InstanceId 关联实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 关联实例ID
     * @param InstanceId 关联实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 关联实例类型[VPC,DIRECTCONNECT,VPNGW] 
     * @return InstanceType 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
     * @param InstanceType 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 下一跳资源类型[HAVIP, GWLB_ENDPOINT]] 
     * @return NextHopResourceType 下一跳资源类型[HAVIP, GWLB_ENDPOINT]]
     */
    public String getNextHopResourceType() {
        return this.NextHopResourceType;
    }

    /**
     * Set 下一跳资源类型[HAVIP, GWLB_ENDPOINT]]
     * @param NextHopResourceType 下一跳资源类型[HAVIP, GWLB_ENDPOINT]]
     */
    public void setNextHopResourceType(String NextHopResourceType) {
        this.NextHopResourceType = NextHopResourceType;
    }

    /**
     * Get 下一跳资源ID 
     * @return NextHopResourceId 下一跳资源ID
     */
    public String getNextHopResourceId() {
        return this.NextHopResourceId;
    }

    /**
     * Set 下一跳资源ID
     * @param NextHopResourceId 下一跳资源ID
     */
    public void setNextHopResourceId(String NextHopResourceId) {
        this.NextHopResourceId = NextHopResourceId;
    }

    public CreateCcnPolicyBasedRoutingNextHopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCcnPolicyBasedRoutingNextHopRequest(CreateCcnPolicyBasedRoutingNextHopRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.NextHopRegion != null) {
            this.NextHopRegion = new String(source.NextHopRegion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NextHopResourceType != null) {
            this.NextHopResourceType = new String(source.NextHopResourceType);
        }
        if (source.NextHopResourceId != null) {
            this.NextHopResourceId = new String(source.NextHopResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "NextHopRegion", this.NextHopRegion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NextHopResourceType", this.NextHopResourceType);
        this.setParamSimple(map, prefix + "NextHopResourceId", this.NextHopResourceId);

    }
}

