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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamOnlineInfoRequest  extends AbstractModel{

    /**
    * 取得第几页。
默认值：1。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 0:未开始推流 1:正在推流
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * 获取取得第几页。
默认值：1。
     * @return PageNum 取得第几页。
默认值：1。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置取得第几页。
默认值：1。
     * @param PageNum 取得第几页。
默认值：1。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     * @return PageSize 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     * @param PageSize 分页大小。
最大值：100。
取值范围：1~100 之前的任意整数。
默认值：10。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 获取0:未开始推流 1:正在推流
     * @return Status 0:未开始推流 1:正在推流
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置0:未开始推流 1:正在推流
     * @param Status 0:未开始推流 1:正在推流
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取流名称。
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

