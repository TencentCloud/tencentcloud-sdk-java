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

public class DescribePGUserMigrationResponse extends AbstractModel {

    /**
    * <p>版本号</p><p>参数格式：纯数字，14位时间格式</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>版本名</p><p>参数格式：只允许小写字母和下划线</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>要执行的migration sql 语句</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>回滚的sql 语句</p><p>deprecated</p>
    */
    @SerializedName("Rollback")
    @Expose
    private String Rollback;

    /**
    * <p>migration query 语句的checksum值,由服务端自动生成，同版本 checksum 不一致会拒绝执行</p><p>deprecated</p>
    */
    @SerializedName("Checksum")
    @Expose
    private String Checksum;

    /**
    * <p>用于标记调用来源</p><p>deprecated</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>用于标记该条migration由谁创建，目前默认调用的用户uin</p><p>deprecated</p>
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <p>该migration创建时间</p><p>deprecated</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>该migration应用时间</p><p>deprecated</p>
    */
    @SerializedName("AppliedAt")
    @Expose
    private String AppliedAt;

    /**
    * <p>该migration执行耗时</p><p>单位：毫秒</p><p>deprecated</p>
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>版本号</p><p>参数格式：纯数字，14位时间格式</p> 
     * @return Version <p>版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p><p>参数格式：纯数字，14位时间格式</p>
     * @param Version <p>版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>版本名</p><p>参数格式：只允许小写字母和下划线</p> 
     * @return Name <p>版本名</p><p>参数格式：只允许小写字母和下划线</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>版本名</p><p>参数格式：只允许小写字母和下划线</p>
     * @param Name <p>版本名</p><p>参数格式：只允许小写字母和下划线</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>要执行的migration sql 语句</p> 
     * @return Query <p>要执行的migration sql 语句</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>要执行的migration sql 语句</p>
     * @param Query <p>要执行的migration sql 语句</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>回滚的sql 语句</p><p>deprecated</p> 
     * @return Rollback <p>回滚的sql 语句</p><p>deprecated</p>
     */
    public String getRollback() {
        return this.Rollback;
    }

    /**
     * Set <p>回滚的sql 语句</p><p>deprecated</p>
     * @param Rollback <p>回滚的sql 语句</p><p>deprecated</p>
     */
    public void setRollback(String Rollback) {
        this.Rollback = Rollback;
    }

    /**
     * Get <p>migration query 语句的checksum值,由服务端自动生成，同版本 checksum 不一致会拒绝执行</p><p>deprecated</p> 
     * @return Checksum <p>migration query 语句的checksum值,由服务端自动生成，同版本 checksum 不一致会拒绝执行</p><p>deprecated</p>
     */
    public String getChecksum() {
        return this.Checksum;
    }

    /**
     * Set <p>migration query 语句的checksum值,由服务端自动生成，同版本 checksum 不一致会拒绝执行</p><p>deprecated</p>
     * @param Checksum <p>migration query 语句的checksum值,由服务端自动生成，同版本 checksum 不一致会拒绝执行</p><p>deprecated</p>
     */
    public void setChecksum(String Checksum) {
        this.Checksum = Checksum;
    }

    /**
     * Get <p>用于标记调用来源</p><p>deprecated</p> 
     * @return Source <p>用于标记调用来源</p><p>deprecated</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>用于标记调用来源</p><p>deprecated</p>
     * @param Source <p>用于标记调用来源</p><p>deprecated</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>用于标记该条migration由谁创建，目前默认调用的用户uin</p><p>deprecated</p> 
     * @return CreatedBy <p>用于标记该条migration由谁创建，目前默认调用的用户uin</p><p>deprecated</p>
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>用于标记该条migration由谁创建，目前默认调用的用户uin</p><p>deprecated</p>
     * @param CreatedBy <p>用于标记该条migration由谁创建，目前默认调用的用户uin</p><p>deprecated</p>
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <p>该migration创建时间</p><p>deprecated</p> 
     * @return CreatedAt <p>该migration创建时间</p><p>deprecated</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>该migration创建时间</p><p>deprecated</p>
     * @param CreatedAt <p>该migration创建时间</p><p>deprecated</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>该migration应用时间</p><p>deprecated</p> 
     * @return AppliedAt <p>该migration应用时间</p><p>deprecated</p>
     */
    public String getAppliedAt() {
        return this.AppliedAt;
    }

    /**
     * Set <p>该migration应用时间</p><p>deprecated</p>
     * @param AppliedAt <p>该migration应用时间</p><p>deprecated</p>
     */
    public void setAppliedAt(String AppliedAt) {
        this.AppliedAt = AppliedAt;
    }

    /**
     * Get <p>该migration执行耗时</p><p>单位：毫秒</p><p>deprecated</p> 
     * @return DurationMs <p>该migration执行耗时</p><p>单位：毫秒</p><p>deprecated</p>
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>该migration执行耗时</p><p>单位：毫秒</p><p>deprecated</p>
     * @param DurationMs <p>该migration执行耗时</p><p>单位：毫秒</p><p>deprecated</p>
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePGUserMigrationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePGUserMigrationResponse(DescribePGUserMigrationResponse source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Rollback != null) {
            this.Rollback = new String(source.Rollback);
        }
        if (source.Checksum != null) {
            this.Checksum = new String(source.Checksum);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.AppliedAt != null) {
            this.AppliedAt = new String(source.AppliedAt);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Rollback", this.Rollback);
        this.setParamSimple(map, prefix + "Checksum", this.Checksum);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "AppliedAt", this.AppliedAt);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

