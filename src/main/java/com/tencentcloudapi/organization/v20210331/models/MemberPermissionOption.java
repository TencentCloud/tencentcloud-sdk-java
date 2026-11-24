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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberPermissionOption extends AbstractModel {

    /**
    * <p>权限 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>权限名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>展示状态</p><p>枚举值：</p><ul><li>FIXED： 已勾选且置灰，不可修改</li><li>OPTIONAL： 正常可选</li><li>DISABLE： 置灰不可选，悬浮展示原因</li></ul><p>默认值：OPTIONAL</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否默认勾选</p>
    */
    @SerializedName("DefaultChecked")
    @Expose
    private Boolean DefaultChecked;

    /**
    * <p>置灰原因码</p><p>枚举值：</p><ul><li>TransferNotAllowAdd： 资金划拨权限未命中白名单</li><li>CreditAmountsNotAllowAdd： 信用额度设置权限未命中白名单</li><li>AddDiscountInheritNotAllow： 校验不通过或异常</li></ul>
    */
    @SerializedName("DisabledCode")
    @Expose
    private String DisabledCode;

    /**
     * Get <p>权限 ID</p> 
     * @return Id <p>权限 ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>权限 ID</p>
     * @param Id <p>权限 ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>权限名</p> 
     * @return Name <p>权限名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>权限名</p>
     * @param Name <p>权限名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>展示状态</p><p>枚举值：</p><ul><li>FIXED： 已勾选且置灰，不可修改</li><li>OPTIONAL： 正常可选</li><li>DISABLE： 置灰不可选，悬浮展示原因</li></ul><p>默认值：OPTIONAL</p> 
     * @return Status <p>展示状态</p><p>枚举值：</p><ul><li>FIXED： 已勾选且置灰，不可修改</li><li>OPTIONAL： 正常可选</li><li>DISABLE： 置灰不可选，悬浮展示原因</li></ul><p>默认值：OPTIONAL</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>展示状态</p><p>枚举值：</p><ul><li>FIXED： 已勾选且置灰，不可修改</li><li>OPTIONAL： 正常可选</li><li>DISABLE： 置灰不可选，悬浮展示原因</li></ul><p>默认值：OPTIONAL</p>
     * @param Status <p>展示状态</p><p>枚举值：</p><ul><li>FIXED： 已勾选且置灰，不可修改</li><li>OPTIONAL： 正常可选</li><li>DISABLE： 置灰不可选，悬浮展示原因</li></ul><p>默认值：OPTIONAL</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否默认勾选</p> 
     * @return DefaultChecked <p>是否默认勾选</p>
     */
    public Boolean getDefaultChecked() {
        return this.DefaultChecked;
    }

    /**
     * Set <p>是否默认勾选</p>
     * @param DefaultChecked <p>是否默认勾选</p>
     */
    public void setDefaultChecked(Boolean DefaultChecked) {
        this.DefaultChecked = DefaultChecked;
    }

    /**
     * Get <p>置灰原因码</p><p>枚举值：</p><ul><li>TransferNotAllowAdd： 资金划拨权限未命中白名单</li><li>CreditAmountsNotAllowAdd： 信用额度设置权限未命中白名单</li><li>AddDiscountInheritNotAllow： 校验不通过或异常</li></ul> 
     * @return DisabledCode <p>置灰原因码</p><p>枚举值：</p><ul><li>TransferNotAllowAdd： 资金划拨权限未命中白名单</li><li>CreditAmountsNotAllowAdd： 信用额度设置权限未命中白名单</li><li>AddDiscountInheritNotAllow： 校验不通过或异常</li></ul>
     */
    public String getDisabledCode() {
        return this.DisabledCode;
    }

    /**
     * Set <p>置灰原因码</p><p>枚举值：</p><ul><li>TransferNotAllowAdd： 资金划拨权限未命中白名单</li><li>CreditAmountsNotAllowAdd： 信用额度设置权限未命中白名单</li><li>AddDiscountInheritNotAllow： 校验不通过或异常</li></ul>
     * @param DisabledCode <p>置灰原因码</p><p>枚举值：</p><ul><li>TransferNotAllowAdd： 资金划拨权限未命中白名单</li><li>CreditAmountsNotAllowAdd： 信用额度设置权限未命中白名单</li><li>AddDiscountInheritNotAllow： 校验不通过或异常</li></ul>
     */
    public void setDisabledCode(String DisabledCode) {
        this.DisabledCode = DisabledCode;
    }

    public MemberPermissionOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberPermissionOption(MemberPermissionOption source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DefaultChecked != null) {
            this.DefaultChecked = new Boolean(source.DefaultChecked);
        }
        if (source.DisabledCode != null) {
            this.DisabledCode = new String(source.DisabledCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DefaultChecked", this.DefaultChecked);
        this.setParamSimple(map, prefix + "DisabledCode", this.DisabledCode);

    }
}

