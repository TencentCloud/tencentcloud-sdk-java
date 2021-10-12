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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompressionRule extends AbstractModel{

    /**
    * true：需要设置为 ture，启用压缩
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compress")
    @Expose
    private Boolean Compress;

    /**
    * 触发压缩的文件长度最小值，单位为字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * 触发压缩的文件长度最大值，单位为字节数
最大可设置为 30MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * 文件压缩算法
gzip：指定 GZIP 压缩
brotli：指定Brotli压缩
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Algorithms")
    @Expose
    private String [] Algorithms;

    /**
    * 根据文件后缀类型压缩
例如 jpg、txt
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
contentType：指定Content-Type头为特定值时生效
当指定了此字段时，FileExtensions字段不生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * CacheType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
contentType 时填充 text/html
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get true：需要设置为 ture，启用压缩
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compress true：需要设置为 ture，启用压缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCompress() {
        return this.Compress;
    }

    /**
     * Set true：需要设置为 ture，启用压缩
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compress true：需要设置为 ture，启用压缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompress(Boolean Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 触发压缩的文件长度最小值，单位为字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinLength 触发压缩的文件长度最小值，单位为字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set 触发压缩的文件长度最小值，单位为字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinLength 触发压缩的文件长度最小值，单位为字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get 触发压缩的文件长度最大值，单位为字节数
最大可设置为 30MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxLength 触发压缩的文件长度最大值，单位为字节数
最大可设置为 30MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set 触发压缩的文件长度最大值，单位为字节数
最大可设置为 30MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxLength 触发压缩的文件长度最大值，单位为字节数
最大可设置为 30MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get 文件压缩算法
gzip：指定 GZIP 压缩
brotli：指定Brotli压缩
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Algorithms 文件压缩算法
gzip：指定 GZIP 压缩
brotli：指定Brotli压缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlgorithms() {
        return this.Algorithms;
    }

    /**
     * Set 文件压缩算法
gzip：指定 GZIP 压缩
brotli：指定Brotli压缩
注意：此字段可能返回 null，表示取不到有效值。
     * @param Algorithms 文件压缩算法
gzip：指定 GZIP 压缩
brotli：指定Brotli压缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithms(String [] Algorithms) {
        this.Algorithms = Algorithms;
    }

    /**
     * Get 根据文件后缀类型压缩
例如 jpg、txt
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileExtensions 根据文件后缀类型压缩
例如 jpg、txt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set 根据文件后缀类型压缩
例如 jpg、txt
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExtensions 根据文件后缀类型压缩
例如 jpg、txt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
contentType：指定Content-Type头为特定值时生效
当指定了此字段时，FileExtensions字段不生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
contentType：指定Content-Type头为特定值时生效
当指定了此字段时，FileExtensions字段不生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
contentType：指定Content-Type头为特定值时生效
当指定了此字段时，FileExtensions字段不生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
contentType：指定Content-Type头为特定值时生效
当指定了此字段时，FileExtensions字段不生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get CacheType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
contentType 时填充 text/html
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePaths CacheType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
contentType 时填充 text/html
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set CacheType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
contentType 时填充 text/html
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePaths CacheType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
contentType 时填充 text/html
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public CompressionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompressionRule(CompressionRule source) {
        if (source.Compress != null) {
            this.Compress = new Boolean(source.Compress);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.Algorithms != null) {
            this.Algorithms = new String[source.Algorithms.length];
            for (int i = 0; i < source.Algorithms.length; i++) {
                this.Algorithms[i] = new String(source.Algorithms[i]);
            }
        }
        if (source.FileExtensions != null) {
            this.FileExtensions = new String[source.FileExtensions.length];
            for (int i = 0; i < source.FileExtensions.length; i++) {
                this.FileExtensions[i] = new String(source.FileExtensions[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamArraySimple(map, prefix + "Algorithms.", this.Algorithms);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

