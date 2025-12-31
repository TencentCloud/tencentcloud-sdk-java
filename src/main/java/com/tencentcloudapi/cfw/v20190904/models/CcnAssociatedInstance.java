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
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型
    */
    @SerializedName("InsType")
    @Expose
    private String InsType;

    /**
    * 实例的网段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrLst")
    @Expose
    private String [] CidrLst;

    /**
    * 实例所属地域
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

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
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例类型 
     * @return InsType 实例类型
     */
    public String getInsType() {
        return this.InsType;
    }

    /**
     * Set 实例类型
     * @param InsType 实例类型
     */
    public void setInsType(String InsType) {
        this.InsType = InsType;
    }

    /**
     * Get 实例的网段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrLst 实例的网段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCidrLst() {
        return this.CidrLst;
    }

    /**
     * Set 实例的网段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrLst 实例的网段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrLst(String [] CidrLst) {
        this.CidrLst = CidrLst;
    }

    /**
     * Get 实例所属地域 
     * @return InstanceRegion 实例所属地域
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 实例所属地域
     * @param InstanceRegion 实例所属地域
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
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

    }
}

