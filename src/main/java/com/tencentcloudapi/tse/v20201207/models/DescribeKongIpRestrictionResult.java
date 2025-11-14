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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKongIpRestrictionResult extends AbstractModel {

    /**
    * 访问控制插件绑定的资源类型：route | service
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 路由或服务的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 是否启用插件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 访问控制类型：whiteList｜blackList
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestrictionType")
    @Expose
    private String RestrictionType;

    /**
    * cidr｜ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressList")
    @Expose
    private String [] AddressList;

    /**
     * Get 访问控制插件绑定的资源类型：route | service
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 访问控制插件绑定的资源类型：route | service
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问控制插件绑定的资源类型：route | service
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 访问控制插件绑定的资源类型：route | service
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 路由或服务的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceId 路由或服务的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 路由或服务的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceId 路由或服务的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 是否启用插件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled 是否启用插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用插件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled 是否启用插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 访问控制类型：whiteList｜blackList
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestrictionType 访问控制类型：whiteList｜blackList
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestrictionType() {
        return this.RestrictionType;
    }

    /**
     * Set 访问控制类型：whiteList｜blackList
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestrictionType 访问控制类型：whiteList｜blackList
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestrictionType(String RestrictionType) {
        this.RestrictionType = RestrictionType;
    }

    /**
     * Get cidr｜ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressList cidr｜ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAddressList() {
        return this.AddressList;
    }

    /**
     * Set cidr｜ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressList cidr｜ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressList(String [] AddressList) {
        this.AddressList = AddressList;
    }

    public DescribeKongIpRestrictionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKongIpRestrictionResult(DescribeKongIpRestrictionResult source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RestrictionType != null) {
            this.RestrictionType = new String(source.RestrictionType);
        }
        if (source.AddressList != null) {
            this.AddressList = new String[source.AddressList.length];
            for (int i = 0; i < source.AddressList.length; i++) {
                this.AddressList[i] = new String(source.AddressList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RestrictionType", this.RestrictionType);
        this.setParamArraySimple(map, prefix + "AddressList.", this.AddressList);

    }
}

