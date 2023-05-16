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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AwsS3FileUploadTrigger extends AbstractModel{

    /**
    * 绑定的 AWS S3 存储桶。
    */
    @SerializedName("S3Bucket")
    @Expose
    private String S3Bucket;

    /**
    * 绑定的桶所在 AWS 区域，目前支持：  
us-east-1  
eu-west-3
    */
    @SerializedName("S3Region")
    @Expose
    private String S3Region;

    /**
    * 绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。	
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * 允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。	
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
    * 绑定的 AWS S3 存储桶的秘钥ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3SecretId")
    @Expose
    private String S3SecretId;

    /**
    * 绑定的 AWS S3 存储桶的秘钥Key。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3SecretKey")
    @Expose
    private String S3SecretKey;

    /**
    * 绑定的 AWS S3 存储桶对应的 SQS事件队列。
注意：队列和桶需要在同一区域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AwsSQS")
    @Expose
    private AwsSQS AwsSQS;

    /**
     * Get 绑定的 AWS S3 存储桶。 
     * @return S3Bucket 绑定的 AWS S3 存储桶。
     */
    public String getS3Bucket() {
        return this.S3Bucket;
    }

    /**
     * Set 绑定的 AWS S3 存储桶。
     * @param S3Bucket 绑定的 AWS S3 存储桶。
     */
    public void setS3Bucket(String S3Bucket) {
        this.S3Bucket = S3Bucket;
    }

    /**
     * Get 绑定的桶所在 AWS 区域，目前支持：  
us-east-1  
eu-west-3 
     * @return S3Region 绑定的桶所在 AWS 区域，目前支持：  
us-east-1  
eu-west-3
     */
    public String getS3Region() {
        return this.S3Region;
    }

    /**
     * Set 绑定的桶所在 AWS 区域，目前支持：  
us-east-1  
eu-west-3
     * @param S3Region 绑定的桶所在 AWS 区域，目前支持：  
us-east-1  
eu-west-3
     */
    public void setS3Region(String S3Region) {
        this.S3Region = S3Region;
    }

    /**
     * Get 绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。	 
     * @return Dir 绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。	
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set 绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。	
     * @param Dir 绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。	
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get 允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。	 
     * @return Formats 允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。	
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set 允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。	
     * @param Formats 允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。	
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    /**
     * Get 绑定的 AWS S3 存储桶的秘钥ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3SecretId 绑定的 AWS S3 存储桶的秘钥ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3SecretId() {
        return this.S3SecretId;
    }

    /**
     * Set 绑定的 AWS S3 存储桶的秘钥ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3SecretId 绑定的 AWS S3 存储桶的秘钥ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3SecretId(String S3SecretId) {
        this.S3SecretId = S3SecretId;
    }

    /**
     * Get 绑定的 AWS S3 存储桶的秘钥Key。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3SecretKey 绑定的 AWS S3 存储桶的秘钥Key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3SecretKey() {
        return this.S3SecretKey;
    }

    /**
     * Set 绑定的 AWS S3 存储桶的秘钥Key。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3SecretKey 绑定的 AWS S3 存储桶的秘钥Key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3SecretKey(String S3SecretKey) {
        this.S3SecretKey = S3SecretKey;
    }

    /**
     * Get 绑定的 AWS S3 存储桶对应的 SQS事件队列。
注意：队列和桶需要在同一区域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AwsSQS 绑定的 AWS S3 存储桶对应的 SQS事件队列。
注意：队列和桶需要在同一区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AwsSQS getAwsSQS() {
        return this.AwsSQS;
    }

    /**
     * Set 绑定的 AWS S3 存储桶对应的 SQS事件队列。
注意：队列和桶需要在同一区域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AwsSQS 绑定的 AWS S3 存储桶对应的 SQS事件队列。
注意：队列和桶需要在同一区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwsSQS(AwsSQS AwsSQS) {
        this.AwsSQS = AwsSQS;
    }

    public AwsS3FileUploadTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AwsS3FileUploadTrigger(AwsS3FileUploadTrigger source) {
        if (source.S3Bucket != null) {
            this.S3Bucket = new String(source.S3Bucket);
        }
        if (source.S3Region != null) {
            this.S3Region = new String(source.S3Region);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
        if (source.Formats != null) {
            this.Formats = new String[source.Formats.length];
            for (int i = 0; i < source.Formats.length; i++) {
                this.Formats[i] = new String(source.Formats[i]);
            }
        }
        if (source.S3SecretId != null) {
            this.S3SecretId = new String(source.S3SecretId);
        }
        if (source.S3SecretKey != null) {
            this.S3SecretKey = new String(source.S3SecretKey);
        }
        if (source.AwsSQS != null) {
            this.AwsSQS = new AwsSQS(source.AwsSQS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "S3Bucket", this.S3Bucket);
        this.setParamSimple(map, prefix + "S3Region", this.S3Region);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);
        this.setParamSimple(map, prefix + "S3SecretId", this.S3SecretId);
        this.setParamSimple(map, prefix + "S3SecretKey", this.S3SecretKey);
        this.setParamObj(map, prefix + "AwsSQS.", this.AwsSQS);

    }
}

