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

public class PolicyDetail extends AbstractModel {

    /**
    * <p>策略id</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略作用用户id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>策略的租户uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>文件重定向策略id。取值范围：<br>1：读写<br>2：只读<br>3：禁止读写</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePolicyId")
    @Expose
    private Long FilePolicyId;

    /**
    * <p>剪切板重定向策略id。取值范围：<br>1：开启云桌面到客户端<br>2：开启客户端到云桌面<br>3：双向开启<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClipPolicyId")
    @Expose
    private Long ClipPolicyId;

    /**
    * <p>外设重定向策略id。取值范围：<br>1：允许usb重定向<br>2：允许端口重定向<br>3：允许usb和端口重定向<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrivePolicyId")
    @Expose
    private Long DrivePolicyId;

    /**
    * <p>水印重定向策略id。取值范围（离散值）：<br>4:   当前时间，居中策略<br>10: 当前时间，平铺策略<br>15:  云桌面ID， 居中策略<br>16:  云桌面ID+当前时间， 居中策略<br>17:  云桌面ID， 平铺策略<br>18:  云桌面ID+当前时间， 平铺策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaterMarkPolicyId")
    @Expose
    private Long WaterMarkPolicyId;

    /**
    * <p>是否是默认策略</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>注意：默认策略的当前值无效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUser")
    @Expose
    private Long TotalUser;

    /**
     * Get <p>策略id</p> 
     * @return PolicyId <p>策略id</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略id</p>
     * @param PolicyId <p>策略id</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>策略名称</p> 
     * @return PolicyName <p>策略名称</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>策略名称</p>
     * @param PolicyName <p>策略名称</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略作用用户id列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIds <p>策略作用用户id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>策略作用用户id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIds <p>策略作用用户id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>策略的租户uin</p> 
     * @return Uin <p>策略的租户uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>策略的租户uin</p>
     * @param Uin <p>策略的租户uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>文件重定向策略id。取值范围：<br>1：读写<br>2：只读<br>3：禁止读写</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePolicyId <p>文件重定向策略id。取值范围：<br>1：读写<br>2：只读<br>3：禁止读写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFilePolicyId() {
        return this.FilePolicyId;
    }

    /**
     * Set <p>文件重定向策略id。取值范围：<br>1：读写<br>2：只读<br>3：禁止读写</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePolicyId <p>文件重定向策略id。取值范围：<br>1：读写<br>2：只读<br>3：禁止读写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePolicyId(Long FilePolicyId) {
        this.FilePolicyId = FilePolicyId;
    }

    /**
     * Get <p>剪切板重定向策略id。取值范围：<br>1：开启云桌面到客户端<br>2：开启客户端到云桌面<br>3：双向开启<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClipPolicyId <p>剪切板重定向策略id。取值范围：<br>1：开启云桌面到客户端<br>2：开启客户端到云桌面<br>3：双向开启<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClipPolicyId() {
        return this.ClipPolicyId;
    }

    /**
     * Set <p>剪切板重定向策略id。取值范围：<br>1：开启云桌面到客户端<br>2：开启客户端到云桌面<br>3：双向开启<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClipPolicyId <p>剪切板重定向策略id。取值范围：<br>1：开启云桌面到客户端<br>2：开启客户端到云桌面<br>3：双向开启<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClipPolicyId(Long ClipPolicyId) {
        this.ClipPolicyId = ClipPolicyId;
    }

    /**
     * Get <p>外设重定向策略id。取值范围：<br>1：允许usb重定向<br>2：允许端口重定向<br>3：允许usb和端口重定向<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrivePolicyId <p>外设重定向策略id。取值范围：<br>1：允许usb重定向<br>2：允许端口重定向<br>3：允许usb和端口重定向<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDrivePolicyId() {
        return this.DrivePolicyId;
    }

    /**
     * Set <p>外设重定向策略id。取值范围：<br>1：允许usb重定向<br>2：允许端口重定向<br>3：允许usb和端口重定向<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrivePolicyId <p>外设重定向策略id。取值范围：<br>1：允许usb重定向<br>2：允许端口重定向<br>3：允许usb和端口重定向<br>4：禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrivePolicyId(Long DrivePolicyId) {
        this.DrivePolicyId = DrivePolicyId;
    }

    /**
     * Get <p>水印重定向策略id。取值范围（离散值）：<br>4:   当前时间，居中策略<br>10: 当前时间，平铺策略<br>15:  云桌面ID， 居中策略<br>16:  云桌面ID+当前时间， 居中策略<br>17:  云桌面ID， 平铺策略<br>18:  云桌面ID+当前时间， 平铺策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaterMarkPolicyId <p>水印重定向策略id。取值范围（离散值）：<br>4:   当前时间，居中策略<br>10: 当前时间，平铺策略<br>15:  云桌面ID， 居中策略<br>16:  云桌面ID+当前时间， 居中策略<br>17:  云桌面ID， 平铺策略<br>18:  云桌面ID+当前时间， 平铺策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaterMarkPolicyId() {
        return this.WaterMarkPolicyId;
    }

    /**
     * Set <p>水印重定向策略id。取值范围（离散值）：<br>4:   当前时间，居中策略<br>10: 当前时间，平铺策略<br>15:  云桌面ID， 居中策略<br>16:  云桌面ID+当前时间， 居中策略<br>17:  云桌面ID， 平铺策略<br>18:  云桌面ID+当前时间， 平铺策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaterMarkPolicyId <p>水印重定向策略id。取值范围（离散值）：<br>4:   当前时间，居中策略<br>10: 当前时间，平铺策略<br>15:  云桌面ID， 居中策略<br>16:  云桌面ID+当前时间， 居中策略<br>17:  云桌面ID， 平铺策略<br>18:  云桌面ID+当前时间， 平铺策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaterMarkPolicyId(Long WaterMarkPolicyId) {
        this.WaterMarkPolicyId = WaterMarkPolicyId;
    }

    /**
     * Get <p>是否是默认策略</p> 
     * @return IsDefault <p>是否是默认策略</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否是默认策略</p>
     * @param IsDefault <p>是否是默认策略</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>注意：默认策略的当前值无效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUser <p>注意：默认策略的当前值无效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalUser() {
        return this.TotalUser;
    }

    /**
     * Set <p>注意：默认策略的当前值无效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUser <p>注意：默认策略的当前值无效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUser(Long TotalUser) {
        this.TotalUser = TotalUser;
    }

    public PolicyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyDetail(PolicyDetail source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.FilePolicyId != null) {
            this.FilePolicyId = new Long(source.FilePolicyId);
        }
        if (source.ClipPolicyId != null) {
            this.ClipPolicyId = new Long(source.ClipPolicyId);
        }
        if (source.DrivePolicyId != null) {
            this.DrivePolicyId = new Long(source.DrivePolicyId);
        }
        if (source.WaterMarkPolicyId != null) {
            this.WaterMarkPolicyId = new Long(source.WaterMarkPolicyId);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.TotalUser != null) {
            this.TotalUser = new Long(source.TotalUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "FilePolicyId", this.FilePolicyId);
        this.setParamSimple(map, prefix + "ClipPolicyId", this.ClipPolicyId);
        this.setParamSimple(map, prefix + "DrivePolicyId", this.DrivePolicyId);
        this.setParamSimple(map, prefix + "WaterMarkPolicyId", this.WaterMarkPolicyId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "TotalUser", this.TotalUser);

    }
}

