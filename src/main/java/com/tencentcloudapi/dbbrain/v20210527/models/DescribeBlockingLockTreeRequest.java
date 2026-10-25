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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockingLockTreeRequest extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，固定为sqlserver。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>lock monitor 扫描轮次 ID（可从 DescribeBlockingTimeRange 返回的 MonitorLoops 列表选择，也可从 DescribeBlockingLogs / DescribeBlockingTrees 返回的 MonitorLoop 字段获取）。与 BlockingTime 二选一，MonitorLoop 优先。</p>
    */
    @SerializedName("MonitorLoop")
    @Expose
    private String MonitorLoop;

    /**
    * <p>阻塞时间点，格式：yyyy-MM-dd HH:mm:ss。当 MonitorLoop 为空时使用该字段定位：后端会在该时间点±1分钟范围内寻找最接近的 MonitorLoop 并下钻其阻塞树。与 MonitorLoop 二选一。BlockingTime 必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
    */
    @SerializedName("BlockingTime")
    @Expose
    private String BlockingTime;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型，固定为sqlserver。</p> 
     * @return Product <p>服务产品类型，固定为sqlserver。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，固定为sqlserver。</p>
     * @param Product <p>服务产品类型，固定为sqlserver。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>lock monitor 扫描轮次 ID（可从 DescribeBlockingTimeRange 返回的 MonitorLoops 列表选择，也可从 DescribeBlockingLogs / DescribeBlockingTrees 返回的 MonitorLoop 字段获取）。与 BlockingTime 二选一，MonitorLoop 优先。</p> 
     * @return MonitorLoop <p>lock monitor 扫描轮次 ID（可从 DescribeBlockingTimeRange 返回的 MonitorLoops 列表选择，也可从 DescribeBlockingLogs / DescribeBlockingTrees 返回的 MonitorLoop 字段获取）。与 BlockingTime 二选一，MonitorLoop 优先。</p>
     */
    public String getMonitorLoop() {
        return this.MonitorLoop;
    }

    /**
     * Set <p>lock monitor 扫描轮次 ID（可从 DescribeBlockingTimeRange 返回的 MonitorLoops 列表选择，也可从 DescribeBlockingLogs / DescribeBlockingTrees 返回的 MonitorLoop 字段获取）。与 BlockingTime 二选一，MonitorLoop 优先。</p>
     * @param MonitorLoop <p>lock monitor 扫描轮次 ID（可从 DescribeBlockingTimeRange 返回的 MonitorLoops 列表选择，也可从 DescribeBlockingLogs / DescribeBlockingTrees 返回的 MonitorLoop 字段获取）。与 BlockingTime 二选一，MonitorLoop 优先。</p>
     */
    public void setMonitorLoop(String MonitorLoop) {
        this.MonitorLoop = MonitorLoop;
    }

    /**
     * Get <p>阻塞时间点，格式：yyyy-MM-dd HH:mm:ss。当 MonitorLoop 为空时使用该字段定位：后端会在该时间点±1分钟范围内寻找最接近的 MonitorLoop 并下钻其阻塞树。与 MonitorLoop 二选一。BlockingTime 必须在最近 30 天内，否则返回 InvalidParameterValue。</p> 
     * @return BlockingTime <p>阻塞时间点，格式：yyyy-MM-dd HH:mm:ss。当 MonitorLoop 为空时使用该字段定位：后端会在该时间点±1分钟范围内寻找最接近的 MonitorLoop 并下钻其阻塞树。与 MonitorLoop 二选一。BlockingTime 必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     */
    public String getBlockingTime() {
        return this.BlockingTime;
    }

    /**
     * Set <p>阻塞时间点，格式：yyyy-MM-dd HH:mm:ss。当 MonitorLoop 为空时使用该字段定位：后端会在该时间点±1分钟范围内寻找最接近的 MonitorLoop 并下钻其阻塞树。与 MonitorLoop 二选一。BlockingTime 必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     * @param BlockingTime <p>阻塞时间点，格式：yyyy-MM-dd HH:mm:ss。当 MonitorLoop 为空时使用该字段定位：后端会在该时间点±1分钟范围内寻找最接近的 MonitorLoop 并下钻其阻塞树。与 MonitorLoop 二选一。BlockingTime 必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     */
    public void setBlockingTime(String BlockingTime) {
        this.BlockingTime = BlockingTime;
    }

    public DescribeBlockingLockTreeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockingLockTreeRequest(DescribeBlockingLockTreeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.MonitorLoop != null) {
            this.MonitorLoop = new String(source.MonitorLoop);
        }
        if (source.BlockingTime != null) {
            this.BlockingTime = new String(source.BlockingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "MonitorLoop", this.MonitorLoop);
        this.setParamSimple(map, prefix + "BlockingTime", this.BlockingTime);

    }
}

