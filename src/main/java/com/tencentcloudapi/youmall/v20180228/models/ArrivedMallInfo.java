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

public class ArrivedMallInfo  extends AbstractModel{

    /**
    * 到场时间
    */
    @SerializedName("ArrivedTime")
    @Expose
    private String ArrivedTime;

    /**
    * 出场时间
    */
    @SerializedName("LeaveTime")
    @Expose
    private String LeaveTime;

    /**
    * 停留时间，秒
    */
    @SerializedName("StaySecond")
    @Expose
    private Integer StaySecond;

    /**
    * 到场抓拍图片
    */
    @SerializedName("InCapPic")
    @Expose
    private String InCapPic;

    /**
    * 出场抓拍图片
    */
    @SerializedName("OutCapPic")
    @Expose
    private String OutCapPic;

    /**
    * 轨迹编码
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
     * 获取到场时间
     * @return ArrivedTime 到场时间
     */
    public String getArrivedTime() {
        return this.ArrivedTime;
    }

    /**
     * 设置到场时间
     * @param ArrivedTime 到场时间
     */
    public void setArrivedTime(String ArrivedTime) {
        this.ArrivedTime = ArrivedTime;
    }

    /**
     * 获取出场时间
     * @return LeaveTime 出场时间
     */
    public String getLeaveTime() {
        return this.LeaveTime;
    }

    /**
     * 设置出场时间
     * @param LeaveTime 出场时间
     */
    public void setLeaveTime(String LeaveTime) {
        this.LeaveTime = LeaveTime;
    }

    /**
     * 获取停留时间，秒
     * @return StaySecond 停留时间，秒
     */
    public Integer getStaySecond() {
        return this.StaySecond;
    }

    /**
     * 设置停留时间，秒
     * @param StaySecond 停留时间，秒
     */
    public void setStaySecond(Integer StaySecond) {
        this.StaySecond = StaySecond;
    }

    /**
     * 获取到场抓拍图片
     * @return InCapPic 到场抓拍图片
     */
    public String getInCapPic() {
        return this.InCapPic;
    }

    /**
     * 设置到场抓拍图片
     * @param InCapPic 到场抓拍图片
     */
    public void setInCapPic(String InCapPic) {
        this.InCapPic = InCapPic;
    }

    /**
     * 获取出场抓拍图片
     * @return OutCapPic 出场抓拍图片
     */
    public String getOutCapPic() {
        return this.OutCapPic;
    }

    /**
     * 设置出场抓拍图片
     * @param OutCapPic 出场抓拍图片
     */
    public void setOutCapPic(String OutCapPic) {
        this.OutCapPic = OutCapPic;
    }

    /**
     * 获取轨迹编码
     * @return TraceId 轨迹编码
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * 设置轨迹编码
     * @param TraceId 轨迹编码
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArrivedTime", this.ArrivedTime);
        this.setParamSimple(map, prefix + "LeaveTime", this.LeaveTime);
        this.setParamSimple(map, prefix + "StaySecond", this.StaySecond);
        this.setParamSimple(map, prefix + "InCapPic", this.InCapPic);
        this.setParamSimple(map, prefix + "OutCapPic", this.OutCapPic);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);

    }
}

