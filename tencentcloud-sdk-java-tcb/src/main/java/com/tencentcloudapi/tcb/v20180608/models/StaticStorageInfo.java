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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticStorageInfo extends AbstractModel{

    /**
    * 静态CDN域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaticDomain")
    @Expose
    private String StaticDomain;

    /**
    * 静态CDN默认文件夹，当前为根目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDirName")
    @Expose
    private String DefaultDirName;

    /**
    * 资源状态(process/online/offline/init)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * cos所属区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * bucket信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get 静态CDN域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaticDomain 静态CDN域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStaticDomain() {
        return this.StaticDomain;
    }

    /**
     * Set 静态CDN域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaticDomain 静态CDN域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaticDomain(String StaticDomain) {
        this.StaticDomain = StaticDomain;
    }

    /**
     * Get 静态CDN默认文件夹，当前为根目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDirName 静态CDN默认文件夹，当前为根目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultDirName() {
        return this.DefaultDirName;
    }

    /**
     * Set 静态CDN默认文件夹，当前为根目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDirName 静态CDN默认文件夹，当前为根目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDirName(String DefaultDirName) {
        this.DefaultDirName = DefaultDirName;
    }

    /**
     * Get 资源状态(process/online/offline/init)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源状态(process/online/offline/init)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态(process/online/offline/init)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源状态(process/online/offline/init)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get cos所属区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region cos所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos所属区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region cos所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get bucket信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket bucket信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set bucket信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket bucket信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaticDomain", this.StaticDomain);
        this.setParamSimple(map, prefix + "DefaultDirName", this.DefaultDirName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);

    }
}

