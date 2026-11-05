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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegistryRecordVersionListRequest extends AbstractModel {

    /**
    * <p>父 Registry ID，与 RecordId 同时省略或为空字符串时使用市场查询；两者均非空时使用普通查询。</p><p>市场查询仅返回服务端 marketplace.registry_ids 配置来源的未删除资产的 APPROVED 版本；文件还需 READY 且制品可用。普通查询保持 AppID 隔离和原 CAM 权限，即使显式指定官方 Registry 也按普通权限处理。仅一个 ID 非空返回 InvalidParameter。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Record ID。市场和普通 Registry 查询均可省略，提供时仅查询该 Record 的版本。</p><p>省略时查询 RegistryId 所选范围内的可读版本。查询各 Record 的稳定版本时显式传 Filters 的 label=stable。</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>分页起始偏移，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页条数，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件。两种模式默认支持 label、search、descriptor_type、supported_harness_engine、supported_harness_version、metadata. 前缀、status、source_type；record_id 和 version_id 仅支持市场模式。</p><p>同 key 多值 OR，不同 key AND。supported_harness_engine 与 supported_harness_version 必须同时提供，分别对 HarnessEngine 和 HarnessEngineVersion 区分大小写精确匹配，并命中 SupportedHarnessVersions 中同一个对象；禁止跨元素组合，未声明兼容性时不匹配，只提供其中一个返回 InvalidParameter.Filters。search 仅允许单个关键词，匹配 Record 名称或描述；label 匹配当前绑定版本。metadata. 后完整小写文本作为顶层 key，按字符串值精确匹配，不解析嵌套路径。status 支持 PREPARING/PENDING_APPROVAL/APPROVED/REJECTED/CANCELED；source_type 支持 MANUAL/URL_IMPORT/TAR_PACKAGE/FILE。未知或重复 key、空 Values、非法值拒绝。无 Filters 不默认 stable，市场默认浏览显式传 label=stable；筛选不能扩大可读范围。</p>
    */
    @SerializedName("Filters")
    @Expose
    private CloudFilter [] Filters;

    /**
     * Get <p>父 Registry ID，与 RecordId 同时省略或为空字符串时使用市场查询；两者均非空时使用普通查询。</p><p>市场查询仅返回服务端 marketplace.registry_ids 配置来源的未删除资产的 APPROVED 版本；文件还需 READY 且制品可用。普通查询保持 AppID 隔离和原 CAM 权限，即使显式指定官方 Registry 也按普通权限处理。仅一个 ID 非空返回 InvalidParameter。</p> 
     * @return RegistryId <p>父 Registry ID，与 RecordId 同时省略或为空字符串时使用市场查询；两者均非空时使用普通查询。</p><p>市场查询仅返回服务端 marketplace.registry_ids 配置来源的未删除资产的 APPROVED 版本；文件还需 READY 且制品可用。普通查询保持 AppID 隔离和原 CAM 权限，即使显式指定官方 Registry 也按普通权限处理。仅一个 ID 非空返回 InvalidParameter。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>父 Registry ID，与 RecordId 同时省略或为空字符串时使用市场查询；两者均非空时使用普通查询。</p><p>市场查询仅返回服务端 marketplace.registry_ids 配置来源的未删除资产的 APPROVED 版本；文件还需 READY 且制品可用。普通查询保持 AppID 隔离和原 CAM 权限，即使显式指定官方 Registry 也按普通权限处理。仅一个 ID 非空返回 InvalidParameter。</p>
     * @param RegistryId <p>父 Registry ID，与 RecordId 同时省略或为空字符串时使用市场查询；两者均非空时使用普通查询。</p><p>市场查询仅返回服务端 marketplace.registry_ids 配置来源的未删除资产的 APPROVED 版本；文件还需 READY 且制品可用。普通查询保持 AppID 隔离和原 CAM 权限，即使显式指定官方 Registry 也按普通权限处理。仅一个 ID 非空返回 InvalidParameter。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Record ID。市场和普通 Registry 查询均可省略，提供时仅查询该 Record 的版本。</p><p>省略时查询 RegistryId 所选范围内的可读版本。查询各 Record 的稳定版本时显式传 Filters 的 label=stable。</p> 
     * @return RecordId <p>Record ID。市场和普通 Registry 查询均可省略，提供时仅查询该 Record 的版本。</p><p>省略时查询 RegistryId 所选范围内的可读版本。查询各 Record 的稳定版本时显式传 Filters 的 label=stable。</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Record ID。市场和普通 Registry 查询均可省略，提供时仅查询该 Record 的版本。</p><p>省略时查询 RegistryId 所选范围内的可读版本。查询各 Record 的稳定版本时显式传 Filters 的 label=stable。</p>
     * @param RecordId <p>Record ID。市场和普通 Registry 查询均可省略，提供时仅查询该 Record 的版本。</p><p>省略时查询 RegistryId 所选范围内的可读版本。查询各 Record 的稳定版本时显式传 Filters 的 label=stable。</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>分页起始偏移，默认 0。</p> 
     * @return Offset <p>分页起始偏移，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始偏移，默认 0。</p>
     * @param Offset <p>分页起始偏移，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页条数，默认 20，最大 100。</p> 
     * @return Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页条数，默认 20，最大 100。</p>
     * @param Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件。两种模式默认支持 label、search、descriptor_type、supported_harness_engine、supported_harness_version、metadata. 前缀、status、source_type；record_id 和 version_id 仅支持市场模式。</p><p>同 key 多值 OR，不同 key AND。supported_harness_engine 与 supported_harness_version 必须同时提供，分别对 HarnessEngine 和 HarnessEngineVersion 区分大小写精确匹配，并命中 SupportedHarnessVersions 中同一个对象；禁止跨元素组合，未声明兼容性时不匹配，只提供其中一个返回 InvalidParameter.Filters。search 仅允许单个关键词，匹配 Record 名称或描述；label 匹配当前绑定版本。metadata. 后完整小写文本作为顶层 key，按字符串值精确匹配，不解析嵌套路径。status 支持 PREPARING/PENDING_APPROVAL/APPROVED/REJECTED/CANCELED；source_type 支持 MANUAL/URL_IMPORT/TAR_PACKAGE/FILE。未知或重复 key、空 Values、非法值拒绝。无 Filters 不默认 stable，市场默认浏览显式传 label=stable；筛选不能扩大可读范围。</p> 
     * @return Filters <p>过滤条件。两种模式默认支持 label、search、descriptor_type、supported_harness_engine、supported_harness_version、metadata. 前缀、status、source_type；record_id 和 version_id 仅支持市场模式。</p><p>同 key 多值 OR，不同 key AND。supported_harness_engine 与 supported_harness_version 必须同时提供，分别对 HarnessEngine 和 HarnessEngineVersion 区分大小写精确匹配，并命中 SupportedHarnessVersions 中同一个对象；禁止跨元素组合，未声明兼容性时不匹配，只提供其中一个返回 InvalidParameter.Filters。search 仅允许单个关键词，匹配 Record 名称或描述；label 匹配当前绑定版本。metadata. 后完整小写文本作为顶层 key，按字符串值精确匹配，不解析嵌套路径。status 支持 PREPARING/PENDING_APPROVAL/APPROVED/REJECTED/CANCELED；source_type 支持 MANUAL/URL_IMPORT/TAR_PACKAGE/FILE。未知或重复 key、空 Values、非法值拒绝。无 Filters 不默认 stable，市场默认浏览显式传 label=stable；筛选不能扩大可读范围。</p>
     */
    public CloudFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。两种模式默认支持 label、search、descriptor_type、supported_harness_engine、supported_harness_version、metadata. 前缀、status、source_type；record_id 和 version_id 仅支持市场模式。</p><p>同 key 多值 OR，不同 key AND。supported_harness_engine 与 supported_harness_version 必须同时提供，分别对 HarnessEngine 和 HarnessEngineVersion 区分大小写精确匹配，并命中 SupportedHarnessVersions 中同一个对象；禁止跨元素组合，未声明兼容性时不匹配，只提供其中一个返回 InvalidParameter.Filters。search 仅允许单个关键词，匹配 Record 名称或描述；label 匹配当前绑定版本。metadata. 后完整小写文本作为顶层 key，按字符串值精确匹配，不解析嵌套路径。status 支持 PREPARING/PENDING_APPROVAL/APPROVED/REJECTED/CANCELED；source_type 支持 MANUAL/URL_IMPORT/TAR_PACKAGE/FILE。未知或重复 key、空 Values、非法值拒绝。无 Filters 不默认 stable，市场默认浏览显式传 label=stable；筛选不能扩大可读范围。</p>
     * @param Filters <p>过滤条件。两种模式默认支持 label、search、descriptor_type、supported_harness_engine、supported_harness_version、metadata. 前缀、status、source_type；record_id 和 version_id 仅支持市场模式。</p><p>同 key 多值 OR，不同 key AND。supported_harness_engine 与 supported_harness_version 必须同时提供，分别对 HarnessEngine 和 HarnessEngineVersion 区分大小写精确匹配，并命中 SupportedHarnessVersions 中同一个对象；禁止跨元素组合，未声明兼容性时不匹配，只提供其中一个返回 InvalidParameter.Filters。search 仅允许单个关键词，匹配 Record 名称或描述；label 匹配当前绑定版本。metadata. 后完整小写文本作为顶层 key，按字符串值精确匹配，不解析嵌套路径。status 支持 PREPARING/PENDING_APPROVAL/APPROVED/REJECTED/CANCELED；source_type 支持 MANUAL/URL_IMPORT/TAR_PACKAGE/FILE。未知或重复 key、空 Values、非法值拒绝。无 Filters 不默认 stable，市场默认浏览显式传 label=stable；筛选不能扩大可读范围。</p>
     */
    public void setFilters(CloudFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRegistryRecordVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryRecordVersionListRequest(DescribeRegistryRecordVersionListRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new CloudFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CloudFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

