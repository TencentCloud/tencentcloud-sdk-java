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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailDecisionConfig extends AbstractModel {

    /**
    * <p>已保存的判定模式。新配置仅支持 field_mapping；存量策略可能返回 standard_v2，查询、删除或停用不要求迁移，修改判定配置或重新启用前必须迁移。</p>
    */
    @SerializedName("ContractMode")
    @Expose
    private String ContractMode;

    /**
    * <p>必须显式填写 default 或 response。default 使用 BlockMessage；response 使用 FieldMapping.MessageFieldPath 读取提示，值缺失或不合法时回退默认文案。default 时 BlockMessage 必填，response 时 MessageFieldPath 必填。</p>
    */
    @SerializedName("BlockMessageMode")
    @Expose
    private String BlockMessageMode;

    /**
    * <p>本策略默认/兜底拦截提示，最长 512 个字符。未配置或为空时使用系统按请求语言选择的默认提示；不是替换后的业务响应 Body。</p>
    */
    @SerializedName("BlockMessage")
    @Expose
    private String BlockMessage;

    /**
    * <p>是否允许输出内容替换，省略为 false。开启且配置 RewriteFieldPath 后，输出审核响应只要存在该字段就优先 replace，不要求 HitFieldPath/HitValue 命中，也不要求引擎 decision=replace；替换字段不存在才按命中规则处理。输入永不替换；observe 只记录、不阻断或替换。非法替换正文是审核异常。流式仅替换当前未发送批次，不可撤回已发送内容。</p>
    */
    @SerializedName("RewriteEnabled")
    @Expose
    private Boolean RewriteEnabled;

    /**
    * <p>自定义模式必填的响应字段映射。HitFieldPath 和 HitValue 必填。输出启用替换且替换字段存在时优先 replace；否则要求命中字段存在且为有效同类型标量，值相等时 block，不相等时 allow。缺失或非法命中字段属于无效审核响应，不能等同于安全放行。</p>
    */
    @SerializedName("FieldMapping")
    @Expose
    private CustomGuardrailFieldMapping FieldMapping;

    /**
     * Get <p>已保存的判定模式。新配置仅支持 field_mapping；存量策略可能返回 standard_v2，查询、删除或停用不要求迁移，修改判定配置或重新启用前必须迁移。</p> 
     * @return ContractMode <p>已保存的判定模式。新配置仅支持 field_mapping；存量策略可能返回 standard_v2，查询、删除或停用不要求迁移，修改判定配置或重新启用前必须迁移。</p>
     */
    public String getContractMode() {
        return this.ContractMode;
    }

    /**
     * Set <p>已保存的判定模式。新配置仅支持 field_mapping；存量策略可能返回 standard_v2，查询、删除或停用不要求迁移，修改判定配置或重新启用前必须迁移。</p>
     * @param ContractMode <p>已保存的判定模式。新配置仅支持 field_mapping；存量策略可能返回 standard_v2，查询、删除或停用不要求迁移，修改判定配置或重新启用前必须迁移。</p>
     */
    public void setContractMode(String ContractMode) {
        this.ContractMode = ContractMode;
    }

    /**
     * Get <p>必须显式填写 default 或 response。default 使用 BlockMessage；response 使用 FieldMapping.MessageFieldPath 读取提示，值缺失或不合法时回退默认文案。default 时 BlockMessage 必填，response 时 MessageFieldPath 必填。</p> 
     * @return BlockMessageMode <p>必须显式填写 default 或 response。default 使用 BlockMessage；response 使用 FieldMapping.MessageFieldPath 读取提示，值缺失或不合法时回退默认文案。default 时 BlockMessage 必填，response 时 MessageFieldPath 必填。</p>
     */
    public String getBlockMessageMode() {
        return this.BlockMessageMode;
    }

    /**
     * Set <p>必须显式填写 default 或 response。default 使用 BlockMessage；response 使用 FieldMapping.MessageFieldPath 读取提示，值缺失或不合法时回退默认文案。default 时 BlockMessage 必填，response 时 MessageFieldPath 必填。</p>
     * @param BlockMessageMode <p>必须显式填写 default 或 response。default 使用 BlockMessage；response 使用 FieldMapping.MessageFieldPath 读取提示，值缺失或不合法时回退默认文案。default 时 BlockMessage 必填，response 时 MessageFieldPath 必填。</p>
     */
    public void setBlockMessageMode(String BlockMessageMode) {
        this.BlockMessageMode = BlockMessageMode;
    }

    /**
     * Get <p>本策略默认/兜底拦截提示，最长 512 个字符。未配置或为空时使用系统按请求语言选择的默认提示；不是替换后的业务响应 Body。</p> 
     * @return BlockMessage <p>本策略默认/兜底拦截提示，最长 512 个字符。未配置或为空时使用系统按请求语言选择的默认提示；不是替换后的业务响应 Body。</p>
     */
    public String getBlockMessage() {
        return this.BlockMessage;
    }

    /**
     * Set <p>本策略默认/兜底拦截提示，最长 512 个字符。未配置或为空时使用系统按请求语言选择的默认提示；不是替换后的业务响应 Body。</p>
     * @param BlockMessage <p>本策略默认/兜底拦截提示，最长 512 个字符。未配置或为空时使用系统按请求语言选择的默认提示；不是替换后的业务响应 Body。</p>
     */
    public void setBlockMessage(String BlockMessage) {
        this.BlockMessage = BlockMessage;
    }

    /**
     * Get <p>是否允许输出内容替换，省略为 false。开启且配置 RewriteFieldPath 后，输出审核响应只要存在该字段就优先 replace，不要求 HitFieldPath/HitValue 命中，也不要求引擎 decision=replace；替换字段不存在才按命中规则处理。输入永不替换；observe 只记录、不阻断或替换。非法替换正文是审核异常。流式仅替换当前未发送批次，不可撤回已发送内容。</p> 
     * @return RewriteEnabled <p>是否允许输出内容替换，省略为 false。开启且配置 RewriteFieldPath 后，输出审核响应只要存在该字段就优先 replace，不要求 HitFieldPath/HitValue 命中，也不要求引擎 decision=replace；替换字段不存在才按命中规则处理。输入永不替换；observe 只记录、不阻断或替换。非法替换正文是审核异常。流式仅替换当前未发送批次，不可撤回已发送内容。</p>
     */
    public Boolean getRewriteEnabled() {
        return this.RewriteEnabled;
    }

    /**
     * Set <p>是否允许输出内容替换，省略为 false。开启且配置 RewriteFieldPath 后，输出审核响应只要存在该字段就优先 replace，不要求 HitFieldPath/HitValue 命中，也不要求引擎 decision=replace；替换字段不存在才按命中规则处理。输入永不替换；observe 只记录、不阻断或替换。非法替换正文是审核异常。流式仅替换当前未发送批次，不可撤回已发送内容。</p>
     * @param RewriteEnabled <p>是否允许输出内容替换，省略为 false。开启且配置 RewriteFieldPath 后，输出审核响应只要存在该字段就优先 replace，不要求 HitFieldPath/HitValue 命中，也不要求引擎 decision=replace；替换字段不存在才按命中规则处理。输入永不替换；observe 只记录、不阻断或替换。非法替换正文是审核异常。流式仅替换当前未发送批次，不可撤回已发送内容。</p>
     */
    public void setRewriteEnabled(Boolean RewriteEnabled) {
        this.RewriteEnabled = RewriteEnabled;
    }

    /**
     * Get <p>自定义模式必填的响应字段映射。HitFieldPath 和 HitValue 必填。输出启用替换且替换字段存在时优先 replace；否则要求命中字段存在且为有效同类型标量，值相等时 block，不相等时 allow。缺失或非法命中字段属于无效审核响应，不能等同于安全放行。</p> 
     * @return FieldMapping <p>自定义模式必填的响应字段映射。HitFieldPath 和 HitValue 必填。输出启用替换且替换字段存在时优先 replace；否则要求命中字段存在且为有效同类型标量，值相等时 block，不相等时 allow。缺失或非法命中字段属于无效审核响应，不能等同于安全放行。</p>
     */
    public CustomGuardrailFieldMapping getFieldMapping() {
        return this.FieldMapping;
    }

    /**
     * Set <p>自定义模式必填的响应字段映射。HitFieldPath 和 HitValue 必填。输出启用替换且替换字段存在时优先 replace；否则要求命中字段存在且为有效同类型标量，值相等时 block，不相等时 allow。缺失或非法命中字段属于无效审核响应，不能等同于安全放行。</p>
     * @param FieldMapping <p>自定义模式必填的响应字段映射。HitFieldPath 和 HitValue 必填。输出启用替换且替换字段存在时优先 replace；否则要求命中字段存在且为有效同类型标量，值相等时 block，不相等时 allow。缺失或非法命中字段属于无效审核响应，不能等同于安全放行。</p>
     */
    public void setFieldMapping(CustomGuardrailFieldMapping FieldMapping) {
        this.FieldMapping = FieldMapping;
    }

    public CustomGuardrailDecisionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailDecisionConfig(CustomGuardrailDecisionConfig source) {
        if (source.ContractMode != null) {
            this.ContractMode = new String(source.ContractMode);
        }
        if (source.BlockMessageMode != null) {
            this.BlockMessageMode = new String(source.BlockMessageMode);
        }
        if (source.BlockMessage != null) {
            this.BlockMessage = new String(source.BlockMessage);
        }
        if (source.RewriteEnabled != null) {
            this.RewriteEnabled = new Boolean(source.RewriteEnabled);
        }
        if (source.FieldMapping != null) {
            this.FieldMapping = new CustomGuardrailFieldMapping(source.FieldMapping);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContractMode", this.ContractMode);
        this.setParamSimple(map, prefix + "BlockMessageMode", this.BlockMessageMode);
        this.setParamSimple(map, prefix + "BlockMessage", this.BlockMessage);
        this.setParamSimple(map, prefix + "RewriteEnabled", this.RewriteEnabled);
        this.setParamObj(map, prefix + "FieldMapping.", this.FieldMapping);

    }
}

