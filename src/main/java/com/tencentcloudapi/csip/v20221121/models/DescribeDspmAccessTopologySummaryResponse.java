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

public class DescribeDspmAccessTopologySummaryResponse extends AbstractModel {

    /**
    * 来源IP数
    */
    @SerializedName("SourceIpCount")
    @Expose
    private Long SourceIpCount;

    /**
    * 访问账号数
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * 被访问的库数
    */
    @SerializedName("DbCount")
    @Expose
    private Long DbCount;

    /**
    * 被访问的表数
    */
    @SerializedName("TableCount")
    @Expose
    private Long TableCount;

    /**
    * 近7天访问次数
    */
    @SerializedName("AccessCountLast7Days")
    @Expose
    private Long AccessCountLast7Days;

    /**
    * 近30天访问次数
    */
    @SerializedName("AccessCountLast30Days")
    @Expose
    private Long AccessCountLast30Days;

    /**
    * 表级访问组合数（实例+账号+来源IP+库+schema+表 的去重组合数）
    */
    @SerializedName("TableCombinationCount")
    @Expose
    private Long TableCombinationCount;

    /**
    * 表级访问组合数是否已达上限。为 true 时表级拓扑数据不完整：达上限后新出现的访问组合会被拒绝写入（已有组合仍继续累加），因此展示的拓扑可能缺失部分对象，且保留了哪些组合取决于到达顺序。建议据此显式提示数据不完整。查询不到该标志时不返回本字段
    */
    @SerializedName("DataIncomplete")
    @Expose
    private Boolean DataIncomplete;

    /**
    * 数据最后计算时间。拓扑数据由后台预聚合产生，存在链路延迟；多成员账号场景取各成员中最早的一个
    */
    @SerializedName("LastCalcTime")
    @Expose
    private String LastCalcTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 来源IP数 
     * @return SourceIpCount 来源IP数
     */
    public Long getSourceIpCount() {
        return this.SourceIpCount;
    }

    /**
     * Set 来源IP数
     * @param SourceIpCount 来源IP数
     */
    public void setSourceIpCount(Long SourceIpCount) {
        this.SourceIpCount = SourceIpCount;
    }

    /**
     * Get 访问账号数 
     * @return AccountCount 访问账号数
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 访问账号数
     * @param AccountCount 访问账号数
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get 被访问的库数 
     * @return DbCount 被访问的库数
     */
    public Long getDbCount() {
        return this.DbCount;
    }

    /**
     * Set 被访问的库数
     * @param DbCount 被访问的库数
     */
    public void setDbCount(Long DbCount) {
        this.DbCount = DbCount;
    }

    /**
     * Get 被访问的表数 
     * @return TableCount 被访问的表数
     */
    public Long getTableCount() {
        return this.TableCount;
    }

    /**
     * Set 被访问的表数
     * @param TableCount 被访问的表数
     */
    public void setTableCount(Long TableCount) {
        this.TableCount = TableCount;
    }

    /**
     * Get 近7天访问次数 
     * @return AccessCountLast7Days 近7天访问次数
     */
    public Long getAccessCountLast7Days() {
        return this.AccessCountLast7Days;
    }

    /**
     * Set 近7天访问次数
     * @param AccessCountLast7Days 近7天访问次数
     */
    public void setAccessCountLast7Days(Long AccessCountLast7Days) {
        this.AccessCountLast7Days = AccessCountLast7Days;
    }

    /**
     * Get 近30天访问次数 
     * @return AccessCountLast30Days 近30天访问次数
     */
    public Long getAccessCountLast30Days() {
        return this.AccessCountLast30Days;
    }

    /**
     * Set 近30天访问次数
     * @param AccessCountLast30Days 近30天访问次数
     */
    public void setAccessCountLast30Days(Long AccessCountLast30Days) {
        this.AccessCountLast30Days = AccessCountLast30Days;
    }

    /**
     * Get 表级访问组合数（实例+账号+来源IP+库+schema+表 的去重组合数） 
     * @return TableCombinationCount 表级访问组合数（实例+账号+来源IP+库+schema+表 的去重组合数）
     */
    public Long getTableCombinationCount() {
        return this.TableCombinationCount;
    }

    /**
     * Set 表级访问组合数（实例+账号+来源IP+库+schema+表 的去重组合数）
     * @param TableCombinationCount 表级访问组合数（实例+账号+来源IP+库+schema+表 的去重组合数）
     */
    public void setTableCombinationCount(Long TableCombinationCount) {
        this.TableCombinationCount = TableCombinationCount;
    }

    /**
     * Get 表级访问组合数是否已达上限。为 true 时表级拓扑数据不完整：达上限后新出现的访问组合会被拒绝写入（已有组合仍继续累加），因此展示的拓扑可能缺失部分对象，且保留了哪些组合取决于到达顺序。建议据此显式提示数据不完整。查询不到该标志时不返回本字段 
     * @return DataIncomplete 表级访问组合数是否已达上限。为 true 时表级拓扑数据不完整：达上限后新出现的访问组合会被拒绝写入（已有组合仍继续累加），因此展示的拓扑可能缺失部分对象，且保留了哪些组合取决于到达顺序。建议据此显式提示数据不完整。查询不到该标志时不返回本字段
     */
    public Boolean getDataIncomplete() {
        return this.DataIncomplete;
    }

    /**
     * Set 表级访问组合数是否已达上限。为 true 时表级拓扑数据不完整：达上限后新出现的访问组合会被拒绝写入（已有组合仍继续累加），因此展示的拓扑可能缺失部分对象，且保留了哪些组合取决于到达顺序。建议据此显式提示数据不完整。查询不到该标志时不返回本字段
     * @param DataIncomplete 表级访问组合数是否已达上限。为 true 时表级拓扑数据不完整：达上限后新出现的访问组合会被拒绝写入（已有组合仍继续累加），因此展示的拓扑可能缺失部分对象，且保留了哪些组合取决于到达顺序。建议据此显式提示数据不完整。查询不到该标志时不返回本字段
     */
    public void setDataIncomplete(Boolean DataIncomplete) {
        this.DataIncomplete = DataIncomplete;
    }

    /**
     * Get 数据最后计算时间。拓扑数据由后台预聚合产生，存在链路延迟；多成员账号场景取各成员中最早的一个 
     * @return LastCalcTime 数据最后计算时间。拓扑数据由后台预聚合产生，存在链路延迟；多成员账号场景取各成员中最早的一个
     */
    public String getLastCalcTime() {
        return this.LastCalcTime;
    }

    /**
     * Set 数据最后计算时间。拓扑数据由后台预聚合产生，存在链路延迟；多成员账号场景取各成员中最早的一个
     * @param LastCalcTime 数据最后计算时间。拓扑数据由后台预聚合产生，存在链路延迟；多成员账号场景取各成员中最早的一个
     */
    public void setLastCalcTime(String LastCalcTime) {
        this.LastCalcTime = LastCalcTime;
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

    public DescribeDspmAccessTopologySummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAccessTopologySummaryResponse(DescribeDspmAccessTopologySummaryResponse source) {
        if (source.SourceIpCount != null) {
            this.SourceIpCount = new Long(source.SourceIpCount);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.DbCount != null) {
            this.DbCount = new Long(source.DbCount);
        }
        if (source.TableCount != null) {
            this.TableCount = new Long(source.TableCount);
        }
        if (source.AccessCountLast7Days != null) {
            this.AccessCountLast7Days = new Long(source.AccessCountLast7Days);
        }
        if (source.AccessCountLast30Days != null) {
            this.AccessCountLast30Days = new Long(source.AccessCountLast30Days);
        }
        if (source.TableCombinationCount != null) {
            this.TableCombinationCount = new Long(source.TableCombinationCount);
        }
        if (source.DataIncomplete != null) {
            this.DataIncomplete = new Boolean(source.DataIncomplete);
        }
        if (source.LastCalcTime != null) {
            this.LastCalcTime = new String(source.LastCalcTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIpCount", this.SourceIpCount);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "DbCount", this.DbCount);
        this.setParamSimple(map, prefix + "TableCount", this.TableCount);
        this.setParamSimple(map, prefix + "AccessCountLast7Days", this.AccessCountLast7Days);
        this.setParamSimple(map, prefix + "AccessCountLast30Days", this.AccessCountLast30Days);
        this.setParamSimple(map, prefix + "TableCombinationCount", this.TableCombinationCount);
        this.setParamSimple(map, prefix + "DataIncomplete", this.DataIncomplete);
        this.setParamSimple(map, prefix + "LastCalcTime", this.LastCalcTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

