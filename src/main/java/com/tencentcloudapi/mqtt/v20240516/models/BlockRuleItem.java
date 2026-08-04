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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlockRuleItem extends AbstractModel {

    /**
    * <p>封禁策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>封禁策略类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>包含规则</p>
    */
    @SerializedName("Include")
    @Expose
    private String Include;

    /**
    * <p>排除规则</p>
    */
    @SerializedName("Excludes")
    @Expose
    private String [] Excludes;

    /**
    * <p>过期时间，毫秒级时间戳 。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>修改时间，毫秒级时间戳 。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>创建时间，毫秒级时间戳 。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>封禁策略名</p> 
     * @return Name <p>封禁策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>封禁策略名</p>
     * @param Name <p>封禁策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>封禁策略类型</p> 
     * @return Type <p>封禁策略类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>封禁策略类型</p>
     * @param Type <p>封禁策略类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>包含规则</p> 
     * @return Include <p>包含规则</p>
     */
    public String getInclude() {
        return this.Include;
    }

    /**
     * Set <p>包含规则</p>
     * @param Include <p>包含规则</p>
     */
    public void setInclude(String Include) {
        this.Include = Include;
    }

    /**
     * Get <p>排除规则</p> 
     * @return Excludes <p>排除规则</p>
     */
    public String [] getExcludes() {
        return this.Excludes;
    }

    /**
     * Set <p>排除规则</p>
     * @param Excludes <p>排除规则</p>
     */
    public void setExcludes(String [] Excludes) {
        this.Excludes = Excludes;
    }

    /**
     * Get <p>过期时间，毫秒级时间戳 。</p> 
     * @return ExpireTime <p>过期时间，毫秒级时间戳 。</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间，毫秒级时间戳 。</p>
     * @param ExpireTime <p>过期时间，毫秒级时间戳 。</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>修改时间，毫秒级时间戳 。</p> 
     * @return UpdateTime <p>修改时间，毫秒级时间戳 。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间，毫秒级时间戳 。</p>
     * @param UpdateTime <p>修改时间，毫秒级时间戳 。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建时间，毫秒级时间戳 。</p> 
     * @return CreateTime <p>创建时间，毫秒级时间戳 。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒级时间戳 。</p>
     * @param CreateTime <p>创建时间，毫秒级时间戳 。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public BlockRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockRuleItem(BlockRuleItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Include != null) {
            this.Include = new String(source.Include);
        }
        if (source.Excludes != null) {
            this.Excludes = new String[source.Excludes.length];
            for (int i = 0; i < source.Excludes.length; i++) {
                this.Excludes[i] = new String(source.Excludes[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Include", this.Include);
        this.setParamArraySimple(map, prefix + "Excludes.", this.Excludes);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

