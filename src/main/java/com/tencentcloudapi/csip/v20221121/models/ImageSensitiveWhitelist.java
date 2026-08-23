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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSensitiveWhitelist extends AbstractModel {

    /**
    * <p>敏感信息白名单id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>白名单所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>白名单所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>白名单所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>加白的敏感信息类型</p><p>枚举值：</p><ul><li>1： root启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * <p>白名单范围</p><p>枚举值：</p><ul><li>0： 自选镜像</li><li>1： 全部镜像</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>白名单生效镜像id</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>生效状态</p><p>枚举值：</p><ul><li>0： 白名单失效</li><li>1： 白名单生效</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>敏感信息白名单名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>敏感信息白名单id</p> 
     * @return RuleId <p>敏感信息白名单id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>敏感信息白名单id</p>
     * @param RuleId <p>敏感信息白名单id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>白名单所属账号名</p> 
     * @return OwnerAccountName <p>白名单所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>白名单所属账号名</p>
     * @param OwnerAccountName <p>白名单所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>白名单所属账号uin</p> 
     * @return OwnerUin <p>白名单所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>白名单所属账号uin</p>
     * @param OwnerUin <p>白名单所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>白名单所属账号appid</p> 
     * @return OwnerAppId <p>白名单所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>白名单所属账号appid</p>
     * @param OwnerAppId <p>白名单所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>加白的敏感信息类型</p><p>枚举值：</p><ul><li>1： root启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul> 
     * @return Behavior <p>加白的敏感信息类型</p><p>枚举值：</p><ul><li>1： root启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>加白的敏感信息类型</p><p>枚举值：</p><ul><li>1： root启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
     * @param Behavior <p>加白的敏感信息类型</p><p>枚举值：</p><ul><li>1： root启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>白名单范围</p><p>枚举值：</p><ul><li>0： 自选镜像</li><li>1： 全部镜像</li></ul> 
     * @return Scope <p>白名单范围</p><p>枚举值：</p><ul><li>0： 自选镜像</li><li>1： 全部镜像</li></ul>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>白名单范围</p><p>枚举值：</p><ul><li>0： 自选镜像</li><li>1： 全部镜像</li></ul>
     * @param Scope <p>白名单范围</p><p>枚举值：</p><ul><li>0： 自选镜像</li><li>1： 全部镜像</li></ul>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>白名单生效镜像id</p> 
     * @return ImageIds <p>白名单生效镜像id</p>
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>白名单生效镜像id</p>
     * @param ImageIds <p>白名单生效镜像id</p>
     */
    public void setImageIds(Long [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>生效状态</p><p>枚举值：</p><ul><li>0： 白名单失效</li><li>1： 白名单生效</li></ul> 
     * @return Status <p>生效状态</p><p>枚举值：</p><ul><li>0： 白名单失效</li><li>1： 白名单生效</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>生效状态</p><p>枚举值：</p><ul><li>0： 白名单失效</li><li>1： 白名单生效</li></ul>
     * @param Status <p>生效状态</p><p>枚举值：</p><ul><li>0： 白名单失效</li><li>1： 白名单生效</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>敏感信息白名单名</p> 
     * @return Name <p>敏感信息白名单名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>敏感信息白名单名</p>
     * @param Name <p>敏感信息白名单名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ImageSensitiveWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSensitiveWhitelist(ImageSensitiveWhitelist source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

