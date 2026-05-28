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

public class MigrationSummary extends AbstractModel {

    /**
    * <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>migration query sql 语句checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
    */
    @SerializedName("Checksum")
    @Expose
    private String Checksum;

    /**
    * <p>应用时间</p>
    */
    @SerializedName("AppliedAt")
    @Expose
    private String AppliedAt;

    /**
    * <p>请求来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>migration 创建时间</p>
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
     * Get <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p> 
     * @return Version <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     * @param Version <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p> 
     * @return Name <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     * @param Name <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>migration query sql 语句checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p> 
     * @return Checksum <p>migration query sql 语句checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
     */
    public String getChecksum() {
        return this.Checksum;
    }

    /**
     * Set <p>migration query sql 语句checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
     * @param Checksum <p>migration query sql 语句checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
     */
    public void setChecksum(String Checksum) {
        this.Checksum = Checksum;
    }

    /**
     * Get <p>应用时间</p> 
     * @return AppliedAt <p>应用时间</p>
     */
    public String getAppliedAt() {
        return this.AppliedAt;
    }

    /**
     * Set <p>应用时间</p>
     * @param AppliedAt <p>应用时间</p>
     */
    public void setAppliedAt(String AppliedAt) {
        this.AppliedAt = AppliedAt;
    }

    /**
     * Get <p>请求来源</p> 
     * @return Source <p>请求来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>请求来源</p>
     * @param Source <p>请求来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>migration 创建时间</p> 
     * @return CreatedBy <p>migration 创建时间</p>
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>migration 创建时间</p>
     * @param CreatedBy <p>migration 创建时间</p>
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public MigrationSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationSummary(MigrationSummary source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Checksum != null) {
            this.Checksum = new String(source.Checksum);
        }
        if (source.AppliedAt != null) {
            this.AppliedAt = new String(source.AppliedAt);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Checksum", this.Checksum);
        this.setParamSimple(map, prefix + "AppliedAt", this.AppliedAt);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);

    }
}

