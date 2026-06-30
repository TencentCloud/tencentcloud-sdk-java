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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESTargetParams extends AbstractModel {

    /**
    * <p>网络连接类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetMode")
    @Expose
    private String NetMode;

    /**
    * <p>索引前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexPrefix")
    @Expose
    private String IndexPrefix;

    /**
    * <p>es日志轮换粒度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotationInterval")
    @Expose
    private String RotationInterval;

    /**
    * <p>DTS事件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * <p>DTS索引配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexSuffixMode")
    @Expose
    private String IndexSuffixMode;

    /**
    * <p>es模版类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexTemplateType")
    @Expose
    private String IndexTemplateType;

    /**
     * Get <p>网络连接类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetMode <p>网络连接类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetMode() {
        return this.NetMode;
    }

    /**
     * Set <p>网络连接类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetMode <p>网络连接类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetMode(String NetMode) {
        this.NetMode = NetMode;
    }

    /**
     * Get <p>索引前缀</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexPrefix <p>索引前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexPrefix() {
        return this.IndexPrefix;
    }

    /**
     * Set <p>索引前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexPrefix <p>索引前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexPrefix(String IndexPrefix) {
        this.IndexPrefix = IndexPrefix;
    }

    /**
     * Get <p>es日志轮换粒度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotationInterval <p>es日志轮换粒度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRotationInterval() {
        return this.RotationInterval;
    }

    /**
     * Set <p>es日志轮换粒度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotationInterval <p>es日志轮换粒度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotationInterval(String RotationInterval) {
        this.RotationInterval = RotationInterval;
    }

    /**
     * Get <p>DTS事件配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputMode <p>DTS事件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set <p>DTS事件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputMode <p>DTS事件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get <p>DTS索引配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexSuffixMode <p>DTS索引配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexSuffixMode() {
        return this.IndexSuffixMode;
    }

    /**
     * Set <p>DTS索引配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexSuffixMode <p>DTS索引配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexSuffixMode(String IndexSuffixMode) {
        this.IndexSuffixMode = IndexSuffixMode;
    }

    /**
     * Get <p>es模版类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexTemplateType <p>es模版类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexTemplateType() {
        return this.IndexTemplateType;
    }

    /**
     * Set <p>es模版类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexTemplateType <p>es模版类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexTemplateType(String IndexTemplateType) {
        this.IndexTemplateType = IndexTemplateType;
    }

    public ESTargetParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESTargetParams(ESTargetParams source) {
        if (source.NetMode != null) {
            this.NetMode = new String(source.NetMode);
        }
        if (source.IndexPrefix != null) {
            this.IndexPrefix = new String(source.IndexPrefix);
        }
        if (source.RotationInterval != null) {
            this.RotationInterval = new String(source.RotationInterval);
        }
        if (source.OutputMode != null) {
            this.OutputMode = new String(source.OutputMode);
        }
        if (source.IndexSuffixMode != null) {
            this.IndexSuffixMode = new String(source.IndexSuffixMode);
        }
        if (source.IndexTemplateType != null) {
            this.IndexTemplateType = new String(source.IndexTemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetMode", this.NetMode);
        this.setParamSimple(map, prefix + "IndexPrefix", this.IndexPrefix);
        this.setParamSimple(map, prefix + "RotationInterval", this.RotationInterval);
        this.setParamSimple(map, prefix + "OutputMode", this.OutputMode);
        this.setParamSimple(map, prefix + "IndexSuffixMode", this.IndexSuffixMode);
        this.setParamSimple(map, prefix + "IndexTemplateType", this.IndexTemplateType);

    }
}

