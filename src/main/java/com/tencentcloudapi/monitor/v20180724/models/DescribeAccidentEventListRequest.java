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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccidentEventListRequest extends AbstractModel{

    /**
    * 接口模块名，当前接口取值monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 起始时间，默认一天前的时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，默认当前时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页参数，每页返回的数量，取值1~100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，页偏移量，从0开始计数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 根据UpdateTime排序的规则，取值asc或desc
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
    * 根据OccurTime排序的规则，取值asc或desc（优先根据UpdateTimeOrder排序）
    */
    @SerializedName("OccurTimeOrder")
    @Expose
    private String OccurTimeOrder;

    /**
    * 根据事件类型过滤，1表示服务问题，2表示其他订阅
    */
    @SerializedName("AccidentType")
    @Expose
    private Long [] AccidentType;

    /**
    * 根据事件过滤，1表示云服务器存储问题，2表示云服务器网络连接问题，3表示云服务器运行异常，202表示运营商网络抖动
    */
    @SerializedName("AccidentEvent")
    @Expose
    private Long [] AccidentEvent;

    /**
    * 根据事件状态过滤，0表示已恢复，1表示未恢复
    */
    @SerializedName("AccidentStatus")
    @Expose
    private Long [] AccidentStatus;

    /**
    * 根据事件地域过滤，gz表示广州，sh表示上海等
    */
    @SerializedName("AccidentRegion")
    @Expose
    private String [] AccidentRegion;

    /**
    * 根据影响资源过滤，比如ins-19a06bka
    */
    @SerializedName("AffectResource")
    @Expose
    private String AffectResource;

    /**
     * Get 接口模块名，当前接口取值monitor 
     * @return Module 接口模块名，当前接口取值monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 接口模块名，当前接口取值monitor
     * @param Module 接口模块名，当前接口取值monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 起始时间，默认一天前的时间戳 
     * @return StartTime 起始时间，默认一天前的时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，默认一天前的时间戳
     * @param StartTime 起始时间，默认一天前的时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认当前时间戳 
     * @return EndTime 结束时间，默认当前时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认当前时间戳
     * @param EndTime 结束时间，默认当前时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数，每页返回的数量，取值1~100，默认20 
     * @return Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页返回的数量，取值1~100，默认20
     * @param Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，页偏移量，从0开始计数，默认0 
     * @return Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，页偏移量，从0开始计数，默认0
     * @param Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 根据UpdateTime排序的规则，取值asc或desc 
     * @return UpdateTimeOrder 根据UpdateTime排序的规则，取值asc或desc
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set 根据UpdateTime排序的规则，取值asc或desc
     * @param UpdateTimeOrder 根据UpdateTime排序的规则，取值asc或desc
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    /**
     * Get 根据OccurTime排序的规则，取值asc或desc（优先根据UpdateTimeOrder排序） 
     * @return OccurTimeOrder 根据OccurTime排序的规则，取值asc或desc（优先根据UpdateTimeOrder排序）
     */
    public String getOccurTimeOrder() {
        return this.OccurTimeOrder;
    }

    /**
     * Set 根据OccurTime排序的规则，取值asc或desc（优先根据UpdateTimeOrder排序）
     * @param OccurTimeOrder 根据OccurTime排序的规则，取值asc或desc（优先根据UpdateTimeOrder排序）
     */
    public void setOccurTimeOrder(String OccurTimeOrder) {
        this.OccurTimeOrder = OccurTimeOrder;
    }

    /**
     * Get 根据事件类型过滤，1表示服务问题，2表示其他订阅 
     * @return AccidentType 根据事件类型过滤，1表示服务问题，2表示其他订阅
     */
    public Long [] getAccidentType() {
        return this.AccidentType;
    }

    /**
     * Set 根据事件类型过滤，1表示服务问题，2表示其他订阅
     * @param AccidentType 根据事件类型过滤，1表示服务问题，2表示其他订阅
     */
    public void setAccidentType(Long [] AccidentType) {
        this.AccidentType = AccidentType;
    }

    /**
     * Get 根据事件过滤，1表示云服务器存储问题，2表示云服务器网络连接问题，3表示云服务器运行异常，202表示运营商网络抖动 
     * @return AccidentEvent 根据事件过滤，1表示云服务器存储问题，2表示云服务器网络连接问题，3表示云服务器运行异常，202表示运营商网络抖动
     */
    public Long [] getAccidentEvent() {
        return this.AccidentEvent;
    }

    /**
     * Set 根据事件过滤，1表示云服务器存储问题，2表示云服务器网络连接问题，3表示云服务器运行异常，202表示运营商网络抖动
     * @param AccidentEvent 根据事件过滤，1表示云服务器存储问题，2表示云服务器网络连接问题，3表示云服务器运行异常，202表示运营商网络抖动
     */
    public void setAccidentEvent(Long [] AccidentEvent) {
        this.AccidentEvent = AccidentEvent;
    }

    /**
     * Get 根据事件状态过滤，0表示已恢复，1表示未恢复 
     * @return AccidentStatus 根据事件状态过滤，0表示已恢复，1表示未恢复
     */
    public Long [] getAccidentStatus() {
        return this.AccidentStatus;
    }

    /**
     * Set 根据事件状态过滤，0表示已恢复，1表示未恢复
     * @param AccidentStatus 根据事件状态过滤，0表示已恢复，1表示未恢复
     */
    public void setAccidentStatus(Long [] AccidentStatus) {
        this.AccidentStatus = AccidentStatus;
    }

    /**
     * Get 根据事件地域过滤，gz表示广州，sh表示上海等 
     * @return AccidentRegion 根据事件地域过滤，gz表示广州，sh表示上海等
     */
    public String [] getAccidentRegion() {
        return this.AccidentRegion;
    }

    /**
     * Set 根据事件地域过滤，gz表示广州，sh表示上海等
     * @param AccidentRegion 根据事件地域过滤，gz表示广州，sh表示上海等
     */
    public void setAccidentRegion(String [] AccidentRegion) {
        this.AccidentRegion = AccidentRegion;
    }

    /**
     * Get 根据影响资源过滤，比如ins-19a06bka 
     * @return AffectResource 根据影响资源过滤，比如ins-19a06bka
     */
    public String getAffectResource() {
        return this.AffectResource;
    }

    /**
     * Set 根据影响资源过滤，比如ins-19a06bka
     * @param AffectResource 根据影响资源过滤，比如ins-19a06bka
     */
    public void setAffectResource(String AffectResource) {
        this.AffectResource = AffectResource;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "UpdateTimeOrder", this.UpdateTimeOrder);
        this.setParamSimple(map, prefix + "OccurTimeOrder", this.OccurTimeOrder);
        this.setParamArraySimple(map, prefix + "AccidentType.", this.AccidentType);
        this.setParamArraySimple(map, prefix + "AccidentEvent.", this.AccidentEvent);
        this.setParamArraySimple(map, prefix + "AccidentStatus.", this.AccidentStatus);
        this.setParamArraySimple(map, prefix + "AccidentRegion.", this.AccidentRegion);
        this.setParamSimple(map, prefix + "AffectResource", this.AffectResource);

    }
}

