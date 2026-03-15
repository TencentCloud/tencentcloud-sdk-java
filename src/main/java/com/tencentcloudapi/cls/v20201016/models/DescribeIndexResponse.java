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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexResponse extends AbstractModel {

    /**
    * <p>日志主题Id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>索引状态。true：开启状态，false：关闭状态<br>开启后可对日志进行检索分析，将产生索引流量、索引存储及相应费用。<a href="https://cloud.tencent.com/document/product/614/45802#.E8.AE.A1.E8.B4.B9.E9.A1.B9">费用详情</a></p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>索引配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

    /**
    * <p>索引修改时间，初始值为索引创建时间。格式 <code>YYYY-MM-DD HH:MM:SS</code></p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>内置保留字段（<code>__FILENAME__</code>，<code>__HOSTNAME__</code>及<code>__SOURCE__</code>）是否包含至全文索引</p><ul><li>false:不包含</li><li>true:包含</li></ul>
    */
    @SerializedName("IncludeInternalFields")
    @Expose
    private Boolean IncludeInternalFields;

    /**
    * <p>元数据字段（前缀为<code>__TAG__</code>的字段）是否包含至全文索引</p><ul><li>0:仅包含开启键值索引的元数据字段</li><li>1:包含所有元数据字段</li><li>2:不包含任何元数据字段</li></ul>
    */
    @SerializedName("MetadataFlag")
    @Expose
    private Long MetadataFlag;

    /**
    * <p>自定义日志解析异常存储字段。</p>
    */
    @SerializedName("CoverageField")
    @Expose
    private String CoverageField;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>日志主题Id</p> 
     * @return TopicId <p>日志主题Id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题Id</p>
     * @param TopicId <p>日志主题Id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>索引状态。true：开启状态，false：关闭状态<br>开启后可对日志进行检索分析，将产生索引流量、索引存储及相应费用。<a href="https://cloud.tencent.com/document/product/614/45802#.E8.AE.A1.E8.B4.B9.E9.A1.B9">费用详情</a></p> 
     * @return Status <p>索引状态。true：开启状态，false：关闭状态<br>开启后可对日志进行检索分析，将产生索引流量、索引存储及相应费用。<a href="https://cloud.tencent.com/document/product/614/45802#.E8.AE.A1.E8.B4.B9.E9.A1.B9">费用详情</a></p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>索引状态。true：开启状态，false：关闭状态<br>开启后可对日志进行检索分析，将产生索引流量、索引存储及相应费用。<a href="https://cloud.tencent.com/document/product/614/45802#.E8.AE.A1.E8.B4.B9.E9.A1.B9">费用详情</a></p>
     * @param Status <p>索引状态。true：开启状态，false：关闭状态<br>开启后可对日志进行检索分析，将产生索引流量、索引存储及相应费用。<a href="https://cloud.tencent.com/document/product/614/45802#.E8.AE.A1.E8.B4.B9.E9.A1.B9">费用详情</a></p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>索引配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rule <p>索引配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set <p>索引配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rule <p>索引配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRule(RuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>索引修改时间，初始值为索引创建时间。格式 <code>YYYY-MM-DD HH:MM:SS</code></p> 
     * @return ModifyTime <p>索引修改时间，初始值为索引创建时间。格式 <code>YYYY-MM-DD HH:MM:SS</code></p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>索引修改时间，初始值为索引创建时间。格式 <code>YYYY-MM-DD HH:MM:SS</code></p>
     * @param ModifyTime <p>索引修改时间，初始值为索引创建时间。格式 <code>YYYY-MM-DD HH:MM:SS</code></p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>内置保留字段（<code>__FILENAME__</code>，<code>__HOSTNAME__</code>及<code>__SOURCE__</code>）是否包含至全文索引</p><ul><li>false:不包含</li><li>true:包含</li></ul> 
     * @return IncludeInternalFields <p>内置保留字段（<code>__FILENAME__</code>，<code>__HOSTNAME__</code>及<code>__SOURCE__</code>）是否包含至全文索引</p><ul><li>false:不包含</li><li>true:包含</li></ul>
     */
    public Boolean getIncludeInternalFields() {
        return this.IncludeInternalFields;
    }

    /**
     * Set <p>内置保留字段（<code>__FILENAME__</code>，<code>__HOSTNAME__</code>及<code>__SOURCE__</code>）是否包含至全文索引</p><ul><li>false:不包含</li><li>true:包含</li></ul>
     * @param IncludeInternalFields <p>内置保留字段（<code>__FILENAME__</code>，<code>__HOSTNAME__</code>及<code>__SOURCE__</code>）是否包含至全文索引</p><ul><li>false:不包含</li><li>true:包含</li></ul>
     */
    public void setIncludeInternalFields(Boolean IncludeInternalFields) {
        this.IncludeInternalFields = IncludeInternalFields;
    }

    /**
     * Get <p>元数据字段（前缀为<code>__TAG__</code>的字段）是否包含至全文索引</p><ul><li>0:仅包含开启键值索引的元数据字段</li><li>1:包含所有元数据字段</li><li>2:不包含任何元数据字段</li></ul> 
     * @return MetadataFlag <p>元数据字段（前缀为<code>__TAG__</code>的字段）是否包含至全文索引</p><ul><li>0:仅包含开启键值索引的元数据字段</li><li>1:包含所有元数据字段</li><li>2:不包含任何元数据字段</li></ul>
     */
    public Long getMetadataFlag() {
        return this.MetadataFlag;
    }

    /**
     * Set <p>元数据字段（前缀为<code>__TAG__</code>的字段）是否包含至全文索引</p><ul><li>0:仅包含开启键值索引的元数据字段</li><li>1:包含所有元数据字段</li><li>2:不包含任何元数据字段</li></ul>
     * @param MetadataFlag <p>元数据字段（前缀为<code>__TAG__</code>的字段）是否包含至全文索引</p><ul><li>0:仅包含开启键值索引的元数据字段</li><li>1:包含所有元数据字段</li><li>2:不包含任何元数据字段</li></ul>
     */
    public void setMetadataFlag(Long MetadataFlag) {
        this.MetadataFlag = MetadataFlag;
    }

    /**
     * Get <p>自定义日志解析异常存储字段。</p> 
     * @return CoverageField <p>自定义日志解析异常存储字段。</p>
     */
    public String getCoverageField() {
        return this.CoverageField;
    }

    /**
     * Set <p>自定义日志解析异常存储字段。</p>
     * @param CoverageField <p>自定义日志解析异常存储字段。</p>
     */
    public void setCoverageField(String CoverageField) {
        this.CoverageField = CoverageField;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIndexResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIndexResponse(DescribeIndexResponse source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new RuleInfo(source.Rule);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IncludeInternalFields != null) {
            this.IncludeInternalFields = new Boolean(source.IncludeInternalFields);
        }
        if (source.MetadataFlag != null) {
            this.MetadataFlag = new Long(source.MetadataFlag);
        }
        if (source.CoverageField != null) {
            this.CoverageField = new String(source.CoverageField);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IncludeInternalFields", this.IncludeInternalFields);
        this.setParamSimple(map, prefix + "MetadataFlag", this.MetadataFlag);
        this.setParamSimple(map, prefix + "CoverageField", this.CoverageField);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

