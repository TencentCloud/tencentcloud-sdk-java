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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupResp extends AbstractModel {

    /**
    * 租户Id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 规则组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 规则数量
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 产品类型
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建人SubUin
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 创建人名称
    */
    @SerializedName("CreateName")
    @Expose
    private String CreateName;

    /**
    * 更新人SubUin
    */
    @SerializedName("UpdateBy")
    @Expose
    private String UpdateBy;

    /**
    * 更新人名称
    */
    @SerializedName("UpdateName")
    @Expose
    private String UpdateName;

    /**
    * 下发关联账号
    */
    @SerializedName("ReceiveAccount")
    @Expose
    private ReceiveAccount [] ReceiveAccount;

    /**
    *  所属阶段
    */
    @SerializedName("ExecAreas")
    @Expose
    private String [] ExecAreas;

    /**
    * 规则方向：1-入站规则，0-出站规则，-1 表示无方向
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get 租户Id 
     * @return AppId 租户Id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户Id
     * @param AppId 租户Id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 规则组Id 
     * @return GroupId 规则组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组Id
     * @param GroupId 规则组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 规则组名称 
     * @return GroupName 规则组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 规则组名称
     * @param GroupName 规则组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 规则数量 
     * @return RuleCount 规则数量
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 规则数量
     * @param RuleCount 规则数量
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 产品类型 
     * @return Product 产品类型
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品类型
     * @param Product 产品类型
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建人SubUin 
     * @return CreateBy 创建人SubUin
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 创建人SubUin
     * @param CreateBy 创建人SubUin
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 创建人名称 
     * @return CreateName 创建人名称
     */
    public String getCreateName() {
        return this.CreateName;
    }

    /**
     * Set 创建人名称
     * @param CreateName 创建人名称
     */
    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    /**
     * Get 更新人SubUin 
     * @return UpdateBy 更新人SubUin
     */
    public String getUpdateBy() {
        return this.UpdateBy;
    }

    /**
     * Set 更新人SubUin
     * @param UpdateBy 更新人SubUin
     */
    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    /**
     * Get 更新人名称 
     * @return UpdateName 更新人名称
     */
    public String getUpdateName() {
        return this.UpdateName;
    }

    /**
     * Set 更新人名称
     * @param UpdateName 更新人名称
     */
    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    /**
     * Get 下发关联账号 
     * @return ReceiveAccount 下发关联账号
     */
    public ReceiveAccount [] getReceiveAccount() {
        return this.ReceiveAccount;
    }

    /**
     * Set 下发关联账号
     * @param ReceiveAccount 下发关联账号
     */
    public void setReceiveAccount(ReceiveAccount [] ReceiveAccount) {
        this.ReceiveAccount = ReceiveAccount;
    }

    /**
     * Get  所属阶段 
     * @return ExecAreas  所属阶段
     */
    public String [] getExecAreas() {
        return this.ExecAreas;
    }

    /**
     * Set  所属阶段
     * @param ExecAreas  所属阶段
     */
    public void setExecAreas(String [] ExecAreas) {
        this.ExecAreas = ExecAreas;
    }

    /**
     * Get 规则方向：1-入站规则，0-出站规则，-1 表示无方向 
     * @return Direction 规则方向：1-入站规则，0-出站规则，-1 表示无方向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1-入站规则，0-出站规则，-1 表示无方向
     * @param Direction 规则方向：1-入站规则，0-出站规则，-1 表示无方向
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public RuleGroupResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupResp(RuleGroupResp source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.CreateName != null) {
            this.CreateName = new String(source.CreateName);
        }
        if (source.UpdateBy != null) {
            this.UpdateBy = new String(source.UpdateBy);
        }
        if (source.UpdateName != null) {
            this.UpdateName = new String(source.UpdateName);
        }
        if (source.ReceiveAccount != null) {
            this.ReceiveAccount = new ReceiveAccount[source.ReceiveAccount.length];
            for (int i = 0; i < source.ReceiveAccount.length; i++) {
                this.ReceiveAccount[i] = new ReceiveAccount(source.ReceiveAccount[i]);
            }
        }
        if (source.ExecAreas != null) {
            this.ExecAreas = new String[source.ExecAreas.length];
            for (int i = 0; i < source.ExecAreas.length; i++) {
                this.ExecAreas[i] = new String(source.ExecAreas[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "CreateName", this.CreateName);
        this.setParamSimple(map, prefix + "UpdateBy", this.UpdateBy);
        this.setParamSimple(map, prefix + "UpdateName", this.UpdateName);
        this.setParamArrayObj(map, prefix + "ReceiveAccount.", this.ReceiveAccount);
        this.setParamArraySimple(map, prefix + "ExecAreas.", this.ExecAreas);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

