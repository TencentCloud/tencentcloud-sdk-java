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

public class AddEnterpriseSecurityGroupRulesRequest extends AbstractModel {

    /**
    * 待创建的规则数组，不能为空。每条规则必须提供访问源、访问目的、动作、非空描述和字符串 OrderIndex。未使用 ServiceTemplateId 时必须提供 Protocol 和 Port；使用 ServiceTemplateId 时二者可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 可省略，默认使用 SG。
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule [] Data;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * 保留字段，不提供幂等保证；重复请求仍可能重复创建规则，建议省略。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 添加方式。batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号的全部可操作企业安全组规则后再添加 Data，添加失败时已删除的规则不会恢复，风险极高。两种批量导入都会使用 Data.Enable。其它值按普通新增处理。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 延迟生效标记。1 表示将规则保留为待生效状态，0 表示按账号当前发布设置处理；省略等同于 0。账号停止自动发布时，规则仍保持待生效。
    */
    @SerializedName("IsDelay")
    @Expose
    private Long IsDelay;

    /**
    * 规则 ID 复用标记。1 表示使用每条规则的 Data.Id，此时 Data.Id 传十进制数字字符串；其它值由系统分配 ID。重复 ID 会导致创建失败。
    */
    @SerializedName("IsUseId")
    @Expose
    private Long IsUseId;

    /**
    * 添加位置类型，可省略，默认为 0：0 添加到末尾，1 添加到最前，2 从指定顺序插入。Type=0 或 1 按 Data 数组顺序确定最终顺序；Type=2 使用首条 Data.OrderIndex 作为插入位置，超过当前最大顺序时添加到末尾。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 待创建的规则数组，不能为空。每条规则必须提供访问源、访问目的、动作、非空描述和字符串 OrderIndex。未使用 ServiceTemplateId 时必须提供 Protocol 和 Port；使用 ServiceTemplateId 时二者可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 可省略，默认使用 SG。 
     * @return Data 待创建的规则数组，不能为空。每条规则必须提供访问源、访问目的、动作、非空描述和字符串 OrderIndex。未使用 ServiceTemplateId 时必须提供 Protocol 和 Port；使用 ServiceTemplateId 时二者可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 可省略，默认使用 SG。
     */
    public SecurityGroupRule [] getData() {
        return this.Data;
    }

    /**
     * Set 待创建的规则数组，不能为空。每条规则必须提供访问源、访问目的、动作、非空描述和字符串 OrderIndex。未使用 ServiceTemplateId 时必须提供 Protocol 和 Port；使用 ServiceTemplateId 时二者可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 可省略，默认使用 SG。
     * @param Data 待创建的规则数组，不能为空。每条规则必须提供访问源、访问目的、动作、非空描述和字符串 OrderIndex。未使用 ServiceTemplateId 时必须提供 Protocol 和 Port；使用 ServiceTemplateId 时二者可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 可省略，默认使用 SG。
     */
    public void setData(SecurityGroupRule [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get 保留字段，不提供幂等保证；重复请求仍可能重复创建规则，建议省略。 
     * @return ClientToken 保留字段，不提供幂等保证；重复请求仍可能重复创建规则，建议省略。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 保留字段，不提供幂等保证；重复请求仍可能重复创建规则，建议省略。
     * @param ClientToken 保留字段，不提供幂等保证；重复请求仍可能重复创建规则，建议省略。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 添加方式。batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号的全部可操作企业安全组规则后再添加 Data，添加失败时已删除的规则不会恢复，风险极高。两种批量导入都会使用 Data.Enable。其它值按普通新增处理。 
     * @return From 添加方式。batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号的全部可操作企业安全组规则后再添加 Data，添加失败时已删除的规则不会恢复，风险极高。两种批量导入都会使用 Data.Enable。其它值按普通新增处理。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 添加方式。batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号的全部可操作企业安全组规则后再添加 Data，添加失败时已删除的规则不会恢复，风险极高。两种批量导入都会使用 Data.Enable。其它值按普通新增处理。
     * @param From 添加方式。batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号的全部可操作企业安全组规则后再添加 Data，添加失败时已删除的规则不会恢复，风险极高。两种批量导入都会使用 Data.Enable。其它值按普通新增处理。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 延迟生效标记。1 表示将规则保留为待生效状态，0 表示按账号当前发布设置处理；省略等同于 0。账号停止自动发布时，规则仍保持待生效。 
     * @return IsDelay 延迟生效标记。1 表示将规则保留为待生效状态，0 表示按账号当前发布设置处理；省略等同于 0。账号停止自动发布时，规则仍保持待生效。
     */
    public Long getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set 延迟生效标记。1 表示将规则保留为待生效状态，0 表示按账号当前发布设置处理；省略等同于 0。账号停止自动发布时，规则仍保持待生效。
     * @param IsDelay 延迟生效标记。1 表示将规则保留为待生效状态，0 表示按账号当前发布设置处理；省略等同于 0。账号停止自动发布时，规则仍保持待生效。
     */
    public void setIsDelay(Long IsDelay) {
        this.IsDelay = IsDelay;
    }

    /**
     * Get 规则 ID 复用标记。1 表示使用每条规则的 Data.Id，此时 Data.Id 传十进制数字字符串；其它值由系统分配 ID。重复 ID 会导致创建失败。 
     * @return IsUseId 规则 ID 复用标记。1 表示使用每条规则的 Data.Id，此时 Data.Id 传十进制数字字符串；其它值由系统分配 ID。重复 ID 会导致创建失败。
     */
    public Long getIsUseId() {
        return this.IsUseId;
    }

    /**
     * Set 规则 ID 复用标记。1 表示使用每条规则的 Data.Id，此时 Data.Id 传十进制数字字符串；其它值由系统分配 ID。重复 ID 会导致创建失败。
     * @param IsUseId 规则 ID 复用标记。1 表示使用每条规则的 Data.Id，此时 Data.Id 传十进制数字字符串；其它值由系统分配 ID。重复 ID 会导致创建失败。
     */
    public void setIsUseId(Long IsUseId) {
        this.IsUseId = IsUseId;
    }

    /**
     * Get 添加位置类型，可省略，默认为 0：0 添加到末尾，1 添加到最前，2 从指定顺序插入。Type=0 或 1 按 Data 数组顺序确定最终顺序；Type=2 使用首条 Data.OrderIndex 作为插入位置，超过当前最大顺序时添加到末尾。 
     * @return Type 添加位置类型，可省略，默认为 0：0 添加到末尾，1 添加到最前，2 从指定顺序插入。Type=0 或 1 按 Data 数组顺序确定最终顺序；Type=2 使用首条 Data.OrderIndex 作为插入位置，超过当前最大顺序时添加到末尾。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 添加位置类型，可省略，默认为 0：0 添加到末尾，1 添加到最前，2 从指定顺序插入。Type=0 或 1 按 Data 数组顺序确定最终顺序；Type=2 使用首条 Data.OrderIndex 作为插入位置，超过当前最大顺序时添加到末尾。
     * @param Type 添加位置类型，可省略，默认为 0：0 添加到末尾，1 添加到最前，2 从指定顺序插入。Type=0 或 1 按 Data 数组顺序确定最终顺序；Type=2 使用首条 Data.OrderIndex 作为插入位置，超过当前最大顺序时添加到末尾。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public AddEnterpriseSecurityGroupRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEnterpriseSecurityGroupRulesRequest(AddEnterpriseSecurityGroupRulesRequest source) {
        if (source.Data != null) {
            this.Data = new SecurityGroupRule[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupRule(source.Data[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.IsDelay != null) {
            this.IsDelay = new Long(source.IsDelay);
        }
        if (source.IsUseId != null) {
            this.IsUseId = new Long(source.IsUseId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "IsDelay", this.IsDelay);
        this.setParamSimple(map, prefix + "IsUseId", this.IsUseId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

