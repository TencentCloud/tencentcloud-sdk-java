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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticConfig extends AbstractModel {

    /**
    * 框架类型：vue、react、nextjs 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * Node.js 版本，默认 20
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeJsVersion")
    @Expose
    private String NodeJsVersion;

    /**
    * 访问路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppPath")
    @Expose
    private String AppPath;

    /**
    * 构建目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildPath")
    @Expose
    private String BuildPath;

    /**
    * ZIP 文件地址（BuildType=ZIP/TEMPLATE 时使用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZipFileUrl")
    @Expose
    private String ZipFileUrl;

    /**
    * COS 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosTimestamp")
    @Expose
    private String CosTimestamp;

    /**
    * COS 文件后缀
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosSuffix")
    @Expose
    private String CosSuffix;

    /**
    * 代码源平台：github、gitlab、gitee
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
    * 代码仓库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeRepo")
    @Expose
    private String CodeRepo;

    /**
    * 代码分支
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeBranch")
    @Expose
    private String CodeBranch;

    /**
    * 构建参数 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaticCmd")
    @Expose
    private StaticCmd StaticCmd;

    /**
    * 构建环境变量 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaticEnv")
    @Expose
    private StaticEnvironment StaticEnv;

    /**
     * Get 框架类型：vue、react、nextjs 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Framework 框架类型：vue、react、nextjs 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 框架类型：vue、react、nextjs 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Framework 框架类型：vue、react、nextjs 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get Node.js 版本，默认 20
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeJsVersion Node.js 版本，默认 20
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeJsVersion() {
        return this.NodeJsVersion;
    }

    /**
     * Set Node.js 版本，默认 20
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeJsVersion Node.js 版本，默认 20
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeJsVersion(String NodeJsVersion) {
        this.NodeJsVersion = NodeJsVersion;
    }

    /**
     * Get 访问路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppPath 访问路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppPath() {
        return this.AppPath;
    }

    /**
     * Set 访问路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppPath 访问路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppPath(String AppPath) {
        this.AppPath = AppPath;
    }

    /**
     * Get 构建目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildPath 构建目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildPath() {
        return this.BuildPath;
    }

    /**
     * Set 构建目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildPath 构建目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildPath(String BuildPath) {
        this.BuildPath = BuildPath;
    }

    /**
     * Get ZIP 文件地址（BuildType=ZIP/TEMPLATE 时使用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZipFileUrl ZIP 文件地址（BuildType=ZIP/TEMPLATE 时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZipFileUrl() {
        return this.ZipFileUrl;
    }

    /**
     * Set ZIP 文件地址（BuildType=ZIP/TEMPLATE 时使用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZipFileUrl ZIP 文件地址（BuildType=ZIP/TEMPLATE 时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZipFileUrl(String ZipFileUrl) {
        this.ZipFileUrl = ZipFileUrl;
    }

    /**
     * Get COS 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosTimestamp COS 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosTimestamp() {
        return this.CosTimestamp;
    }

    /**
     * Set COS 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosTimestamp COS 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosTimestamp(String CosTimestamp) {
        this.CosTimestamp = CosTimestamp;
    }

    /**
     * Get COS 文件后缀
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosSuffix COS 文件后缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosSuffix() {
        return this.CosSuffix;
    }

    /**
     * Set COS 文件后缀
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosSuffix COS 文件后缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosSuffix(String CosSuffix) {
        this.CosSuffix = CosSuffix;
    }

    /**
     * Get 代码源平台：github、gitlab、gitee
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeSource 代码源平台：github、gitlab、gitee
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set 代码源平台：github、gitlab、gitee
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeSource 代码源平台：github、gitlab、gitee
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * Get 代码仓库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeRepo 代码仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeRepo() {
        return this.CodeRepo;
    }

    /**
     * Set 代码仓库
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeRepo 代码仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeRepo(String CodeRepo) {
        this.CodeRepo = CodeRepo;
    }

    /**
     * Get 代码分支
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeBranch 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeBranch() {
        return this.CodeBranch;
    }

    /**
     * Set 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeBranch 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeBranch(String CodeBranch) {
        this.CodeBranch = CodeBranch;
    }

    /**
     * Get 构建参数 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaticCmd 构建参数 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StaticCmd getStaticCmd() {
        return this.StaticCmd;
    }

    /**
     * Set 构建参数 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaticCmd 构建参数 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaticCmd(StaticCmd StaticCmd) {
        this.StaticCmd = StaticCmd;
    }

    /**
     * Get 构建环境变量 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaticEnv 构建环境变量 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StaticEnvironment getStaticEnv() {
        return this.StaticEnv;
    }

    /**
     * Set 构建环境变量 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaticEnv 构建环境变量 JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaticEnv(StaticEnvironment StaticEnv) {
        this.StaticEnv = StaticEnv;
    }

    public StaticConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticConfig(StaticConfig source) {
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.NodeJsVersion != null) {
            this.NodeJsVersion = new String(source.NodeJsVersion);
        }
        if (source.AppPath != null) {
            this.AppPath = new String(source.AppPath);
        }
        if (source.BuildPath != null) {
            this.BuildPath = new String(source.BuildPath);
        }
        if (source.ZipFileUrl != null) {
            this.ZipFileUrl = new String(source.ZipFileUrl);
        }
        if (source.CosTimestamp != null) {
            this.CosTimestamp = new String(source.CosTimestamp);
        }
        if (source.CosSuffix != null) {
            this.CosSuffix = new String(source.CosSuffix);
        }
        if (source.CodeSource != null) {
            this.CodeSource = new String(source.CodeSource);
        }
        if (source.CodeRepo != null) {
            this.CodeRepo = new String(source.CodeRepo);
        }
        if (source.CodeBranch != null) {
            this.CodeBranch = new String(source.CodeBranch);
        }
        if (source.StaticCmd != null) {
            this.StaticCmd = new StaticCmd(source.StaticCmd);
        }
        if (source.StaticEnv != null) {
            this.StaticEnv = new StaticEnvironment(source.StaticEnv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "NodeJsVersion", this.NodeJsVersion);
        this.setParamSimple(map, prefix + "AppPath", this.AppPath);
        this.setParamSimple(map, prefix + "BuildPath", this.BuildPath);
        this.setParamSimple(map, prefix + "ZipFileUrl", this.ZipFileUrl);
        this.setParamSimple(map, prefix + "CosTimestamp", this.CosTimestamp);
        this.setParamSimple(map, prefix + "CosSuffix", this.CosSuffix);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);
        this.setParamSimple(map, prefix + "CodeRepo", this.CodeRepo);
        this.setParamSimple(map, prefix + "CodeBranch", this.CodeBranch);
        this.setParamObj(map, prefix + "StaticCmd.", this.StaticCmd);
        this.setParamObj(map, prefix + "StaticEnv.", this.StaticEnv);

    }
}

