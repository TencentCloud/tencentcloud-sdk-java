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

public class TrafficSandboxDLPUserRuleInfo extends AbstractModel {

    /**
    * 文件名称匹配维度：汇总去重后的文件名/正则列表
    */
    @SerializedName("FileName")
    @Expose
    private String [] FileName;

    /**
    * 文件大小限制维度（区间）
    */
    @SerializedName("FileSize")
    @Expose
    private TrafficSandboxDLPFileSizeRange FileSize;

    /**
    * 文件格式限制维度：汇总去重后的格式/类目列表
    */
    @SerializedName("FileType")
    @Expose
    private String [] FileType;

    /**
    * 外发域名检测维度（单值对象）
    */
    @SerializedName("URLRule")
    @Expose
    private TrafficSandboxDLPURLRuleItem URLRule;

    /**
    * 外发内容检测维度（可多行，名称 + 正则）
    */
    @SerializedName("TrafficRule")
    @Expose
    private TrafficSandboxDLPTrafficRuleItem [] TrafficRule;

    /**
     * Get 文件名称匹配维度：汇总去重后的文件名/正则列表 
     * @return FileName 文件名称匹配维度：汇总去重后的文件名/正则列表
     */
    public String [] getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称匹配维度：汇总去重后的文件名/正则列表
     * @param FileName 文件名称匹配维度：汇总去重后的文件名/正则列表
     */
    public void setFileName(String [] FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小限制维度（区间） 
     * @return FileSize 文件大小限制维度（区间）
     */
    public TrafficSandboxDLPFileSizeRange getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小限制维度（区间）
     * @param FileSize 文件大小限制维度（区间）
     */
    public void setFileSize(TrafficSandboxDLPFileSizeRange FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件格式限制维度：汇总去重后的格式/类目列表 
     * @return FileType 文件格式限制维度：汇总去重后的格式/类目列表
     */
    public String [] getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件格式限制维度：汇总去重后的格式/类目列表
     * @param FileType 文件格式限制维度：汇总去重后的格式/类目列表
     */
    public void setFileType(String [] FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 外发域名检测维度（单值对象） 
     * @return URLRule 外发域名检测维度（单值对象）
     */
    public TrafficSandboxDLPURLRuleItem getURLRule() {
        return this.URLRule;
    }

    /**
     * Set 外发域名检测维度（单值对象）
     * @param URLRule 外发域名检测维度（单值对象）
     */
    public void setURLRule(TrafficSandboxDLPURLRuleItem URLRule) {
        this.URLRule = URLRule;
    }

    /**
     * Get 外发内容检测维度（可多行，名称 + 正则） 
     * @return TrafficRule 外发内容检测维度（可多行，名称 + 正则）
     */
    public TrafficSandboxDLPTrafficRuleItem [] getTrafficRule() {
        return this.TrafficRule;
    }

    /**
     * Set 外发内容检测维度（可多行，名称 + 正则）
     * @param TrafficRule 外发内容检测维度（可多行，名称 + 正则）
     */
    public void setTrafficRule(TrafficSandboxDLPTrafficRuleItem [] TrafficRule) {
        this.TrafficRule = TrafficRule;
    }

    public TrafficSandboxDLPUserRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPUserRuleInfo(TrafficSandboxDLPUserRuleInfo source) {
        if (source.FileName != null) {
            this.FileName = new String[source.FileName.length];
            for (int i = 0; i < source.FileName.length; i++) {
                this.FileName[i] = new String(source.FileName[i]);
            }
        }
        if (source.FileSize != null) {
            this.FileSize = new TrafficSandboxDLPFileSizeRange(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String[source.FileType.length];
            for (int i = 0; i < source.FileType.length; i++) {
                this.FileType[i] = new String(source.FileType[i]);
            }
        }
        if (source.URLRule != null) {
            this.URLRule = new TrafficSandboxDLPURLRuleItem(source.URLRule);
        }
        if (source.TrafficRule != null) {
            this.TrafficRule = new TrafficSandboxDLPTrafficRuleItem[source.TrafficRule.length];
            for (int i = 0; i < source.TrafficRule.length; i++) {
                this.TrafficRule[i] = new TrafficSandboxDLPTrafficRuleItem(source.TrafficRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileName.", this.FileName);
        this.setParamObj(map, prefix + "FileSize.", this.FileSize);
        this.setParamArraySimple(map, prefix + "FileType.", this.FileType);
        this.setParamObj(map, prefix + "URLRule.", this.URLRule);
        this.setParamArrayObj(map, prefix + "TrafficRule.", this.TrafficRule);

    }
}

