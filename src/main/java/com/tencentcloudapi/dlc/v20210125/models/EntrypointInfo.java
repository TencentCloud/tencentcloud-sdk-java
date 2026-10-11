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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EntrypointInfo extends AbstractModel {

    /**
    * <p>SQL 语句文本，须为 Base64 编码的 UTF-8 文本。仅 SPARK_SQL 模式可传且必填（解码后 ≤1MB）；SPARK_BATCH 模式禁止传。</p>
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * <p>作业文件路径（JAR/Python），须匹配配置的路径前缀白名单。以 .py 结尾判定为 Python 入口（EntryPoint 禁传），否则为 JAR 入口（EntryPoint 必填）。</p>
    */
    @SerializedName("EntryFile")
    @Expose
    private String EntryFile;

    /**
    * <p>入口类名（main class 全限定名）。JAR 入口（EntryFile 非 .py 结尾）必填；Python 入口（.py 结尾）禁传；SPARK_SQL 模式禁止传。</p>
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * <p>主方法参数列表（JSON 数组字符串），仅 SPARK_BATCH 模式可传；SPARK_SQL 模式禁止传。</p>
    */
    @SerializedName("MainArgs")
    @Expose
    private String MainArgs;

    /**
     * Get <p>SQL 语句文本，须为 Base64 编码的 UTF-8 文本。仅 SPARK_SQL 模式可传且必填（解码后 ≤1MB）；SPARK_BATCH 模式禁止传。</p> 
     * @return Statement <p>SQL 语句文本，须为 Base64 编码的 UTF-8 文本。仅 SPARK_SQL 模式可传且必填（解码后 ≤1MB）；SPARK_BATCH 模式禁止传。</p>
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set <p>SQL 语句文本，须为 Base64 编码的 UTF-8 文本。仅 SPARK_SQL 模式可传且必填（解码后 ≤1MB）；SPARK_BATCH 模式禁止传。</p>
     * @param Statement <p>SQL 语句文本，须为 Base64 编码的 UTF-8 文本。仅 SPARK_SQL 模式可传且必填（解码后 ≤1MB）；SPARK_BATCH 模式禁止传。</p>
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get <p>作业文件路径（JAR/Python），须匹配配置的路径前缀白名单。以 .py 结尾判定为 Python 入口（EntryPoint 禁传），否则为 JAR 入口（EntryPoint 必填）。</p> 
     * @return EntryFile <p>作业文件路径（JAR/Python），须匹配配置的路径前缀白名单。以 .py 结尾判定为 Python 入口（EntryPoint 禁传），否则为 JAR 入口（EntryPoint 必填）。</p>
     */
    public String getEntryFile() {
        return this.EntryFile;
    }

    /**
     * Set <p>作业文件路径（JAR/Python），须匹配配置的路径前缀白名单。以 .py 结尾判定为 Python 入口（EntryPoint 禁传），否则为 JAR 入口（EntryPoint 必填）。</p>
     * @param EntryFile <p>作业文件路径（JAR/Python），须匹配配置的路径前缀白名单。以 .py 结尾判定为 Python 入口（EntryPoint 禁传），否则为 JAR 入口（EntryPoint 必填）。</p>
     */
    public void setEntryFile(String EntryFile) {
        this.EntryFile = EntryFile;
    }

    /**
     * Get <p>入口类名（main class 全限定名）。JAR 入口（EntryFile 非 .py 结尾）必填；Python 入口（.py 结尾）禁传；SPARK_SQL 模式禁止传。</p> 
     * @return EntryPoint <p>入口类名（main class 全限定名）。JAR 入口（EntryFile 非 .py 结尾）必填；Python 入口（.py 结尾）禁传；SPARK_SQL 模式禁止传。</p>
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set <p>入口类名（main class 全限定名）。JAR 入口（EntryFile 非 .py 结尾）必填；Python 入口（.py 结尾）禁传；SPARK_SQL 模式禁止传。</p>
     * @param EntryPoint <p>入口类名（main class 全限定名）。JAR 入口（EntryFile 非 .py 结尾）必填；Python 入口（.py 结尾）禁传；SPARK_SQL 模式禁止传。</p>
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get <p>主方法参数列表（JSON 数组字符串），仅 SPARK_BATCH 模式可传；SPARK_SQL 模式禁止传。</p> 
     * @return MainArgs <p>主方法参数列表（JSON 数组字符串），仅 SPARK_BATCH 模式可传；SPARK_SQL 模式禁止传。</p>
     */
    public String getMainArgs() {
        return this.MainArgs;
    }

    /**
     * Set <p>主方法参数列表（JSON 数组字符串），仅 SPARK_BATCH 模式可传；SPARK_SQL 模式禁止传。</p>
     * @param MainArgs <p>主方法参数列表（JSON 数组字符串），仅 SPARK_BATCH 模式可传；SPARK_SQL 模式禁止传。</p>
     */
    public void setMainArgs(String MainArgs) {
        this.MainArgs = MainArgs;
    }

    public EntrypointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntrypointInfo(EntrypointInfo source) {
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.EntryFile != null) {
            this.EntryFile = new String(source.EntryFile);
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String(source.EntryPoint);
        }
        if (source.MainArgs != null) {
            this.MainArgs = new String(source.MainArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "EntryFile", this.EntryFile);
        this.setParamSimple(map, prefix + "EntryPoint", this.EntryPoint);
        this.setParamSimple(map, prefix + "MainArgs", this.MainArgs);

    }
}

