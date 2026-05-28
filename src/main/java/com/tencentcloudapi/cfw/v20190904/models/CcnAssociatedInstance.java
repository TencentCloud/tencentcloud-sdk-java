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

public class CcnAssociatedInstance extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InsType")
    @Expose
    private String InsType;

    /**
    * <p>实例的网段列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrLst")
    @Expose
    private String [] CidrLst;

    /**
    * <p>实例所属地域</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * <p>是否跨账号</p>
    */
    @SerializedName("IsCrossInstance")
    @Expose
    private Long IsCrossInstance;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InsType <p>实例类型</p>
     */
    public String getInsType() {
        return this.InsType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InsType <p>实例类型</p>
     */
    public void setInsType(String InsType) {
        this.InsType = InsType;
    }

    /**
     * Get <p>实例的网段列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrLst <p>实例的网段列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCidrLst() {
        return this.CidrLst;
    }

    /**
     * Set <p>实例的网段列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrLst <p>实例的网段列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrLst(String [] CidrLst) {
        this.CidrLst = CidrLst;
    }

    /**
     * Get <p>实例所属地域</p> 
     * @return InstanceRegion <p>实例所属地域</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>实例所属地域</p>
     * @param InstanceRegion <p>实例所属地域</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get <p>是否跨账号</p> 
     * @return IsCrossInstance <p>是否跨账号</p>
     */
    public Long getIsCrossInstance() {
        return this.IsCrossInstance;
    }

    /**
     * Set <p>是否跨账号</p>
     * @param IsCrossInstance <p>是否跨账号</p>
     */
    public void setIsCrossInstance(Long IsCrossInstance) {
        this.IsCrossInstance = IsCrossInstance;
    }

    public CcnAssociatedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnAssociatedInstance(CcnAssociatedInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InsType != null) {
            this.InsType = new String(source.InsType);
        }
        if (source.CidrLst != null) {
            this.CidrLst = new String[source.CidrLst.length];
            for (int i = 0; i < source.CidrLst.length; i++) {
                this.CidrLst[i] = new String(source.CidrLst[i]);
            }
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.IsCrossInstance != null) {
            this.IsCrossInstance = new Long(source.IsCrossInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InsType", this.InsType);
        this.setParamArraySimple(map, prefix + "CidrLst.", this.CidrLst);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "IsCrossInstance", this.IsCrossInstance);

    }
}

