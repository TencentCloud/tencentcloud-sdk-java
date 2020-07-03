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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPerformanceResponse extends AbstractModel{

    /**
    * 慢查询数
    */
    @SerializedName("LongQuery")
    @Expose
    private MonitorData LongQuery;

    /**
    * 查询操作数SELECT
    */
    @SerializedName("SelectTotal")
    @Expose
    private MonitorData SelectTotal;

    /**
    * 更新操作数UPDATE
    */
    @SerializedName("UpdateTotal")
    @Expose
    private MonitorData UpdateTotal;

    /**
    * 插入操作数INSERT
    */
    @SerializedName("InsertTotal")
    @Expose
    private MonitorData InsertTotal;

    /**
    * 删除操作数DELETE
    */
    @SerializedName("DeleteTotal")
    @Expose
    private MonitorData DeleteTotal;

    /**
    * 缓存命中率
    */
    @SerializedName("MemHitRate")
    @Expose
    private MonitorData MemHitRate;

    /**
    * 磁盘每秒IO次数
    */
    @SerializedName("DiskIops")
    @Expose
    private MonitorData DiskIops;

    /**
    * 活跃连接数
    */
    @SerializedName("ConnActive")
    @Expose
    private MonitorData ConnActive;

    /**
    * 是否发生主备切换，1为发生，0否
    */
    @SerializedName("IsMasterSwitched")
    @Expose
    private MonitorData IsMasterSwitched;

    /**
    * 主备延迟
    */
    @SerializedName("SlaveDelay")
    @Expose
    private MonitorData SlaveDelay;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 慢查询数 
     * @return LongQuery 慢查询数
     */
    public MonitorData getLongQuery() {
        return this.LongQuery;
    }

    /**
     * Set 慢查询数
     * @param LongQuery 慢查询数
     */
    public void setLongQuery(MonitorData LongQuery) {
        this.LongQuery = LongQuery;
    }

    /**
     * Get 查询操作数SELECT 
     * @return SelectTotal 查询操作数SELECT
     */
    public MonitorData getSelectTotal() {
        return this.SelectTotal;
    }

    /**
     * Set 查询操作数SELECT
     * @param SelectTotal 查询操作数SELECT
     */
    public void setSelectTotal(MonitorData SelectTotal) {
        this.SelectTotal = SelectTotal;
    }

    /**
     * Get 更新操作数UPDATE 
     * @return UpdateTotal 更新操作数UPDATE
     */
    public MonitorData getUpdateTotal() {
        return this.UpdateTotal;
    }

    /**
     * Set 更新操作数UPDATE
     * @param UpdateTotal 更新操作数UPDATE
     */
    public void setUpdateTotal(MonitorData UpdateTotal) {
        this.UpdateTotal = UpdateTotal;
    }

    /**
     * Get 插入操作数INSERT 
     * @return InsertTotal 插入操作数INSERT
     */
    public MonitorData getInsertTotal() {
        return this.InsertTotal;
    }

    /**
     * Set 插入操作数INSERT
     * @param InsertTotal 插入操作数INSERT
     */
    public void setInsertTotal(MonitorData InsertTotal) {
        this.InsertTotal = InsertTotal;
    }

    /**
     * Get 删除操作数DELETE 
     * @return DeleteTotal 删除操作数DELETE
     */
    public MonitorData getDeleteTotal() {
        return this.DeleteTotal;
    }

    /**
     * Set 删除操作数DELETE
     * @param DeleteTotal 删除操作数DELETE
     */
    public void setDeleteTotal(MonitorData DeleteTotal) {
        this.DeleteTotal = DeleteTotal;
    }

    /**
     * Get 缓存命中率 
     * @return MemHitRate 缓存命中率
     */
    public MonitorData getMemHitRate() {
        return this.MemHitRate;
    }

    /**
     * Set 缓存命中率
     * @param MemHitRate 缓存命中率
     */
    public void setMemHitRate(MonitorData MemHitRate) {
        this.MemHitRate = MemHitRate;
    }

    /**
     * Get 磁盘每秒IO次数 
     * @return DiskIops 磁盘每秒IO次数
     */
    public MonitorData getDiskIops() {
        return this.DiskIops;
    }

    /**
     * Set 磁盘每秒IO次数
     * @param DiskIops 磁盘每秒IO次数
     */
    public void setDiskIops(MonitorData DiskIops) {
        this.DiskIops = DiskIops;
    }

    /**
     * Get 活跃连接数 
     * @return ConnActive 活跃连接数
     */
    public MonitorData getConnActive() {
        return this.ConnActive;
    }

    /**
     * Set 活跃连接数
     * @param ConnActive 活跃连接数
     */
    public void setConnActive(MonitorData ConnActive) {
        this.ConnActive = ConnActive;
    }

    /**
     * Get 是否发生主备切换，1为发生，0否 
     * @return IsMasterSwitched 是否发生主备切换，1为发生，0否
     */
    public MonitorData getIsMasterSwitched() {
        return this.IsMasterSwitched;
    }

    /**
     * Set 是否发生主备切换，1为发生，0否
     * @param IsMasterSwitched 是否发生主备切换，1为发生，0否
     */
    public void setIsMasterSwitched(MonitorData IsMasterSwitched) {
        this.IsMasterSwitched = IsMasterSwitched;
    }

    /**
     * Get 主备延迟 
     * @return SlaveDelay 主备延迟
     */
    public MonitorData getSlaveDelay() {
        return this.SlaveDelay;
    }

    /**
     * Set 主备延迟
     * @param SlaveDelay 主备延迟
     */
    public void setSlaveDelay(MonitorData SlaveDelay) {
        this.SlaveDelay = SlaveDelay;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LongQuery.", this.LongQuery);
        this.setParamObj(map, prefix + "SelectTotal.", this.SelectTotal);
        this.setParamObj(map, prefix + "UpdateTotal.", this.UpdateTotal);
        this.setParamObj(map, prefix + "InsertTotal.", this.InsertTotal);
        this.setParamObj(map, prefix + "DeleteTotal.", this.DeleteTotal);
        this.setParamObj(map, prefix + "MemHitRate.", this.MemHitRate);
        this.setParamObj(map, prefix + "DiskIops.", this.DiskIops);
        this.setParamObj(map, prefix + "ConnActive.", this.ConnActive);
        this.setParamObj(map, prefix + "IsMasterSwitched.", this.IsMasterSwitched);
        this.setParamObj(map, prefix + "SlaveDelay.", this.SlaveDelay);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

