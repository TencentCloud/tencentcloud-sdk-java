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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInfo  extends AbstractModel{

    /**
    * 上传带宽，单位Mb/s，-1：未知
    */
    @SerializedName("Upload")
    @Expose
    private Float Upload;

    /**
    * 下载带宽，单位Mb/s，-1：未知
    */
    @SerializedName("Download")
    @Expose
    private Float Download;

    /**
    * 最小延迟，单位ms，-1：未知
    */
    @SerializedName("MinRtt")
    @Expose
    private Float MinRtt;

    /**
    * 平均延迟，单位ms，-1：未知
    */
    @SerializedName("AvgRtt")
    @Expose
    private Float AvgRtt;

    /**
    * 最大延迟，单位ms，-1：未知
    */
    @SerializedName("MaxRtt")
    @Expose
    private Float MaxRtt;

    /**
    * 平均偏差延迟，单位ms，-1：未知
    */
    @SerializedName("MdevRtt")
    @Expose
    private Float MdevRtt;

    /**
    * 丢包率百分比，-1：未知
    */
    @SerializedName("Loss")
    @Expose
    private Float Loss;

    /**
    * 更新时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Integer UpdateTime;

    /**
    * 上报网络状态设备
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
     * 获取上传带宽，单位Mb/s，-1：未知
     * @return Upload 上传带宽，单位Mb/s，-1：未知
     */
    public Float getUpload() {
        return this.Upload;
    }

    /**
     * 设置上传带宽，单位Mb/s，-1：未知
     * @param Upload 上传带宽，单位Mb/s，-1：未知
     */
    public void setUpload(Float Upload) {
        this.Upload = Upload;
    }

    /**
     * 获取下载带宽，单位Mb/s，-1：未知
     * @return Download 下载带宽，单位Mb/s，-1：未知
     */
    public Float getDownload() {
        return this.Download;
    }

    /**
     * 设置下载带宽，单位Mb/s，-1：未知
     * @param Download 下载带宽，单位Mb/s，-1：未知
     */
    public void setDownload(Float Download) {
        this.Download = Download;
    }

    /**
     * 获取最小延迟，单位ms，-1：未知
     * @return MinRtt 最小延迟，单位ms，-1：未知
     */
    public Float getMinRtt() {
        return this.MinRtt;
    }

    /**
     * 设置最小延迟，单位ms，-1：未知
     * @param MinRtt 最小延迟，单位ms，-1：未知
     */
    public void setMinRtt(Float MinRtt) {
        this.MinRtt = MinRtt;
    }

    /**
     * 获取平均延迟，单位ms，-1：未知
     * @return AvgRtt 平均延迟，单位ms，-1：未知
     */
    public Float getAvgRtt() {
        return this.AvgRtt;
    }

    /**
     * 设置平均延迟，单位ms，-1：未知
     * @param AvgRtt 平均延迟，单位ms，-1：未知
     */
    public void setAvgRtt(Float AvgRtt) {
        this.AvgRtt = AvgRtt;
    }

    /**
     * 获取最大延迟，单位ms，-1：未知
     * @return MaxRtt 最大延迟，单位ms，-1：未知
     */
    public Float getMaxRtt() {
        return this.MaxRtt;
    }

    /**
     * 设置最大延迟，单位ms，-1：未知
     * @param MaxRtt 最大延迟，单位ms，-1：未知
     */
    public void setMaxRtt(Float MaxRtt) {
        this.MaxRtt = MaxRtt;
    }

    /**
     * 获取平均偏差延迟，单位ms，-1：未知
     * @return MdevRtt 平均偏差延迟，单位ms，-1：未知
     */
    public Float getMdevRtt() {
        return this.MdevRtt;
    }

    /**
     * 设置平均偏差延迟，单位ms，-1：未知
     * @param MdevRtt 平均偏差延迟，单位ms，-1：未知
     */
    public void setMdevRtt(Float MdevRtt) {
        this.MdevRtt = MdevRtt;
    }

    /**
     * 获取丢包率百分比，-1：未知
     * @return Loss 丢包率百分比，-1：未知
     */
    public Float getLoss() {
        return this.Loss;
    }

    /**
     * 设置丢包率百分比，-1：未知
     * @param Loss 丢包率百分比，-1：未知
     */
    public void setLoss(Float Loss) {
        this.Loss = Loss;
    }

    /**
     * 获取更新时间戳
     * @return UpdateTime 更新时间戳
     */
    public Integer getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间戳
     * @param UpdateTime 更新时间戳
     */
    public void setUpdateTime(Integer UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取上报网络状态设备
     * @return Mac 上报网络状态设备
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * 设置上报网络状态设备
     * @param Mac 上报网络状态设备
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Upload", this.Upload);
        this.setParamSimple(map, prefix + "Download", this.Download);
        this.setParamSimple(map, prefix + "MinRtt", this.MinRtt);
        this.setParamSimple(map, prefix + "AvgRtt", this.AvgRtt);
        this.setParamSimple(map, prefix + "MaxRtt", this.MaxRtt);
        this.setParamSimple(map, prefix + "MdevRtt", this.MdevRtt);
        this.setParamSimple(map, prefix + "Loss", this.Loss);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Mac", this.Mac);

    }
}

