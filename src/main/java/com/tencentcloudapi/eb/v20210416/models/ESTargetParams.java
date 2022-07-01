/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESTargetParams extends AbstractModel{

    /**
    * 网络连接类型
    */
    @SerializedName("NetMode")
    @Expose
    private String NetMode;

    /**
    * 索引前缀
    */
    @SerializedName("IndexPrefix")
    @Expose
    private String IndexPrefix;

    /**
    * es日志轮换粒度
    */
    @SerializedName("RotationInterval")
    @Expose
    private String RotationInterval;

    /**
    * DTS事件配置
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * DTS索引配置
    */
    @SerializedName("IndexSuffixMode")
    @Expose
    private String IndexSuffixMode;

    /**
    * es模版类型
    */
    @SerializedName("IndexTemplateType")
    @Expose
    private String IndexTemplateType;

    /**
     * Get 网络连接类型 
     * @return NetMode 网络连接类型
     */
    public String getNetMode() {
        return this.NetMode;
    }

    /**
     * Set 网络连接类型
     * @param NetMode 网络连接类型
     */
    public void setNetMode(String NetMode) {
        this.NetMode = NetMode;
    }

    /**
     * Get 索引前缀 
     * @return IndexPrefix 索引前缀
     */
    public String getIndexPrefix() {
        return this.IndexPrefix;
    }

    /**
     * Set 索引前缀
     * @param IndexPrefix 索引前缀
     */
    public void setIndexPrefix(String IndexPrefix) {
        this.IndexPrefix = IndexPrefix;
    }

    /**
     * Get es日志轮换粒度 
     * @return RotationInterval es日志轮换粒度
     */
    public String getRotationInterval() {
        return this.RotationInterval;
    }

    /**
     * Set es日志轮换粒度
     * @param RotationInterval es日志轮换粒度
     */
    public void setRotationInterval(String RotationInterval) {
        this.RotationInterval = RotationInterval;
    }

    /**
     * Get DTS事件配置 
     * @return OutputMode DTS事件配置
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set DTS事件配置
     * @param OutputMode DTS事件配置
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get DTS索引配置 
     * @return IndexSuffixMode DTS索引配置
     */
    public String getIndexSuffixMode() {
        return this.IndexSuffixMode;
    }

    /**
     * Set DTS索引配置
     * @param IndexSuffixMode DTS索引配置
     */
    public void setIndexSuffixMode(String IndexSuffixMode) {
        this.IndexSuffixMode = IndexSuffixMode;
    }

    /**
     * Get es模版类型 
     * @return IndexTemplateType es模版类型
     */
    public String getIndexTemplateType() {
        return this.IndexTemplateType;
    }

    /**
     * Set es模版类型
     * @param IndexTemplateType es模版类型
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

