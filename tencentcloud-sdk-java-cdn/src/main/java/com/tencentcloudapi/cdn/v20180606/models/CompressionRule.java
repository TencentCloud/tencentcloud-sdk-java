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
    * 根据文件后缀类型压缩
例如 jpg、txt
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

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
brotli：需要同时指定 GZIP 压缩才可启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Algorithms")
    @Expose
    private String [] Algorithms;

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
brotli：需要同时指定 GZIP 压缩才可启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Algorithms 文件压缩算法
gzip：指定 GZIP 压缩
brotli：需要同时指定 GZIP 压缩才可启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlgorithms() {
        return this.Algorithms;
    }

    /**
     * Set 文件压缩算法
gzip：指定 GZIP 压缩
brotli：需要同时指定 GZIP 压缩才可启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Algorithms 文件压缩算法
gzip：指定 GZIP 压缩
brotli：需要同时指定 GZIP 压缩才可启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithms(String [] Algorithms) {
        this.Algorithms = Algorithms;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamArraySimple(map, prefix + "Algorithms.", this.Algorithms);

    }
}

