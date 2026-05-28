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

public class MigrationPlanItem extends AbstractModel {

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
    * <p>migration query sql checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
    */
    @SerializedName("Checksum")
    @Expose
    private String Checksum;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>pending： 待执行</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>标记请求来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>被归入该分组的原因，比如not_applied、checksum_matched</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

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
     * Get <p>migration query sql checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p> 
     * @return Checksum <p>migration query sql checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
     */
    public String getChecksum() {
        return this.Checksum;
    }

    /**
     * Set <p>migration query sql checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
     * @param Checksum <p>migration query sql checksum</p><p>服务端自动生成，同版本不同checksum会拒绝执行</p>
     */
    public void setChecksum(String Checksum) {
        this.Checksum = Checksum;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>pending： 待执行</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>pending： 待执行</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>pending： 待执行</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>pending： 待执行</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>标记请求来源</p> 
     * @return Source <p>标记请求来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>标记请求来源</p>
     * @param Source <p>标记请求来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>被归入该分组的原因，比如not_applied、checksum_matched</p> 
     * @return Reason <p>被归入该分组的原因，比如not_applied、checksum_matched</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>被归入该分组的原因，比如not_applied、checksum_matched</p>
     * @param Reason <p>被归入该分组的原因，比如not_applied、checksum_matched</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public MigrationPlanItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationPlanItem(MigrationPlanItem source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Checksum != null) {
            this.Checksum = new String(source.Checksum);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Checksum", this.Checksum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

