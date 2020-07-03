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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVirtualNumRequest extends AbstractModel{

    /**
    * 业务appid
    */
    @SerializedName("BizAppId")
    @Expose
    private String BizAppId;

    /**
    * 被叫号码(号码前加 0086，如 008613631686024)
    */
    @SerializedName("Dst")
    @Expose
    private String Dst;

    /**
    * 主叫号码(号码前加 0086，如 008613631686024)，xb 模式下是不用填写，axb 模式下是必选
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * {“accreditList”:[“008613631686024”,”008612345678910”]}，主要用于 N-1 场景，号码绑定非共享是独占型，指定了 dst 独占中间号绑定，accreditList 表示这个列表成员可以拨打 dst 绑 定的中间号，默认值为空，表示所有号码都可以拨打独占型中间号绑定，最大集合不允许超过 30 个，仅适用于xb模式
    */
    @SerializedName("AccreditList")
    @Expose
    private String [] AccreditList;

    /**
    * 指定中间号（格式：008617013541251），如果该中间号已被使用则返回绑定失败。如果不带该字段则由腾讯侧从号码池里自动分配
    */
    @SerializedName("AssignVirtualNum")
    @Expose
    private String AssignVirtualNum;

    /**
    * 是否录音，0表示不录音，1表示录音。默认为不录音，注意如果需要录音回调，通话完成后需要等待一段时间，收到录音回调之后，再解绑中间号。
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 主被叫显号号码归属地，指定该参数说明显号归属该城市，如果没有该城市号码会随机选取一个城市或者后台配置返回107，返回码详见 《腾讯-中间号-城市id.xlsx》
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
    */
    @SerializedName("BizId")
    @Expose
    private String BizId;

    /**
    * 号码最大绑定时间，不填默认为 24 小时，最长绑定时间是168小时，单位秒
    */
    @SerializedName("MaxAssignTime")
    @Expose
    private String MaxAssignTime;

    /**
    * 主叫发起呼叫状态：1
被叫发起呼叫状态：256
主叫响铃状态：2
被叫响铃状态：512
主叫接听状态：4
被叫接听状态：1024
主叫拒绝接听状态：8
被叫拒绝接听状态：2048
主叫正常挂机状态：16
被叫正常挂机状态：4096
主叫呼叫异常：32
被叫呼叫异常：8192

例如：
值为 0：表示所有状态不需要推送
值为 4：表示只要推送主叫接听状态
值为 16191：表示所有状态都需要推送（上面所有值和）
    */
    @SerializedName("StatusFlag")
    @Expose
    private String StatusFlag;

    /**
    * 请填写statusFlag并设置值，状态回调通知地址，正式环境可以配置默认推送地址
    */
    @SerializedName("StatusUrl")
    @Expose
    private String StatusUrl;

    /**
    * 话单回调通知地址，正式环境可以配置默认推送地址
    */
    @SerializedName("HangupUrl")
    @Expose
    private String HangupUrl;

    /**
    * 录单 URL 回调通知地址，正式环境可以配置默认推送地址
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
     * Get 业务appid 
     * @return BizAppId 业务appid
     */
    public String getBizAppId() {
        return this.BizAppId;
    }

    /**
     * Set 业务appid
     * @param BizAppId 业务appid
     */
    public void setBizAppId(String BizAppId) {
        this.BizAppId = BizAppId;
    }

    /**
     * Get 被叫号码(号码前加 0086，如 008613631686024) 
     * @return Dst 被叫号码(号码前加 0086，如 008613631686024)
     */
    public String getDst() {
        return this.Dst;
    }

    /**
     * Set 被叫号码(号码前加 0086，如 008613631686024)
     * @param Dst 被叫号码(号码前加 0086，如 008613631686024)
     */
    public void setDst(String Dst) {
        this.Dst = Dst;
    }

    /**
     * Get 主叫号码(号码前加 0086，如 008613631686024)，xb 模式下是不用填写，axb 模式下是必选 
     * @return Src 主叫号码(号码前加 0086，如 008613631686024)，xb 模式下是不用填写，axb 模式下是必选
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 主叫号码(号码前加 0086，如 008613631686024)，xb 模式下是不用填写，axb 模式下是必选
     * @param Src 主叫号码(号码前加 0086，如 008613631686024)，xb 模式下是不用填写，axb 模式下是必选
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get {“accreditList”:[“008613631686024”,”008612345678910”]}，主要用于 N-1 场景，号码绑定非共享是独占型，指定了 dst 独占中间号绑定，accreditList 表示这个列表成员可以拨打 dst 绑 定的中间号，默认值为空，表示所有号码都可以拨打独占型中间号绑定，最大集合不允许超过 30 个，仅适用于xb模式 
     * @return AccreditList {“accreditList”:[“008613631686024”,”008612345678910”]}，主要用于 N-1 场景，号码绑定非共享是独占型，指定了 dst 独占中间号绑定，accreditList 表示这个列表成员可以拨打 dst 绑 定的中间号，默认值为空，表示所有号码都可以拨打独占型中间号绑定，最大集合不允许超过 30 个，仅适用于xb模式
     */
    public String [] getAccreditList() {
        return this.AccreditList;
    }

    /**
     * Set {“accreditList”:[“008613631686024”,”008612345678910”]}，主要用于 N-1 场景，号码绑定非共享是独占型，指定了 dst 独占中间号绑定，accreditList 表示这个列表成员可以拨打 dst 绑 定的中间号，默认值为空，表示所有号码都可以拨打独占型中间号绑定，最大集合不允许超过 30 个，仅适用于xb模式
     * @param AccreditList {“accreditList”:[“008613631686024”,”008612345678910”]}，主要用于 N-1 场景，号码绑定非共享是独占型，指定了 dst 独占中间号绑定，accreditList 表示这个列表成员可以拨打 dst 绑 定的中间号，默认值为空，表示所有号码都可以拨打独占型中间号绑定，最大集合不允许超过 30 个，仅适用于xb模式
     */
    public void setAccreditList(String [] AccreditList) {
        this.AccreditList = AccreditList;
    }

    /**
     * Get 指定中间号（格式：008617013541251），如果该中间号已被使用则返回绑定失败。如果不带该字段则由腾讯侧从号码池里自动分配 
     * @return AssignVirtualNum 指定中间号（格式：008617013541251），如果该中间号已被使用则返回绑定失败。如果不带该字段则由腾讯侧从号码池里自动分配
     */
    public String getAssignVirtualNum() {
        return this.AssignVirtualNum;
    }

    /**
     * Set 指定中间号（格式：008617013541251），如果该中间号已被使用则返回绑定失败。如果不带该字段则由腾讯侧从号码池里自动分配
     * @param AssignVirtualNum 指定中间号（格式：008617013541251），如果该中间号已被使用则返回绑定失败。如果不带该字段则由腾讯侧从号码池里自动分配
     */
    public void setAssignVirtualNum(String AssignVirtualNum) {
        this.AssignVirtualNum = AssignVirtualNum;
    }

    /**
     * Get 是否录音，0表示不录音，1表示录音。默认为不录音，注意如果需要录音回调，通话完成后需要等待一段时间，收到录音回调之后，再解绑中间号。 
     * @return Record 是否录音，0表示不录音，1表示录音。默认为不录音，注意如果需要录音回调，通话完成后需要等待一段时间，收到录音回调之后，再解绑中间号。
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 是否录音，0表示不录音，1表示录音。默认为不录音，注意如果需要录音回调，通话完成后需要等待一段时间，收到录音回调之后，再解绑中间号。
     * @param Record 是否录音，0表示不录音，1表示录音。默认为不录音，注意如果需要录音回调，通话完成后需要等待一段时间，收到录音回调之后，再解绑中间号。
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 主被叫显号号码归属地，指定该参数说明显号归属该城市，如果没有该城市号码会随机选取一个城市或者后台配置返回107，返回码详见 《腾讯-中间号-城市id.xlsx》 
     * @return CityId 主被叫显号号码归属地，指定该参数说明显号归属该城市，如果没有该城市号码会随机选取一个城市或者后台配置返回107，返回码详见 《腾讯-中间号-城市id.xlsx》
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 主被叫显号号码归属地，指定该参数说明显号归属该城市，如果没有该城市号码会随机选取一个城市或者后台配置返回107，返回码详见 《腾讯-中间号-城市id.xlsx》
     * @param CityId 主被叫显号号码归属地，指定该参数说明显号归属该城市，如果没有该城市号码会随机选取一个城市或者后台配置返回107，返回码详见 《腾讯-中间号-城市id.xlsx》
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。 
     * @return BizId 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
     */
    public String getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
     * @param BizId 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
     */
    public void setBizId(String BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 号码最大绑定时间，不填默认为 24 小时，最长绑定时间是168小时，单位秒 
     * @return MaxAssignTime 号码最大绑定时间，不填默认为 24 小时，最长绑定时间是168小时，单位秒
     */
    public String getMaxAssignTime() {
        return this.MaxAssignTime;
    }

    /**
     * Set 号码最大绑定时间，不填默认为 24 小时，最长绑定时间是168小时，单位秒
     * @param MaxAssignTime 号码最大绑定时间，不填默认为 24 小时，最长绑定时间是168小时，单位秒
     */
    public void setMaxAssignTime(String MaxAssignTime) {
        this.MaxAssignTime = MaxAssignTime;
    }

    /**
     * Get 主叫发起呼叫状态：1
被叫发起呼叫状态：256
主叫响铃状态：2
被叫响铃状态：512
主叫接听状态：4
被叫接听状态：1024
主叫拒绝接听状态：8
被叫拒绝接听状态：2048
主叫正常挂机状态：16
被叫正常挂机状态：4096
主叫呼叫异常：32
被叫呼叫异常：8192

例如：
值为 0：表示所有状态不需要推送
值为 4：表示只要推送主叫接听状态
值为 16191：表示所有状态都需要推送（上面所有值和） 
     * @return StatusFlag 主叫发起呼叫状态：1
被叫发起呼叫状态：256
主叫响铃状态：2
被叫响铃状态：512
主叫接听状态：4
被叫接听状态：1024
主叫拒绝接听状态：8
被叫拒绝接听状态：2048
主叫正常挂机状态：16
被叫正常挂机状态：4096
主叫呼叫异常：32
被叫呼叫异常：8192

例如：
值为 0：表示所有状态不需要推送
值为 4：表示只要推送主叫接听状态
值为 16191：表示所有状态都需要推送（上面所有值和）
     */
    public String getStatusFlag() {
        return this.StatusFlag;
    }

    /**
     * Set 主叫发起呼叫状态：1
被叫发起呼叫状态：256
主叫响铃状态：2
被叫响铃状态：512
主叫接听状态：4
被叫接听状态：1024
主叫拒绝接听状态：8
被叫拒绝接听状态：2048
主叫正常挂机状态：16
被叫正常挂机状态：4096
主叫呼叫异常：32
被叫呼叫异常：8192

例如：
值为 0：表示所有状态不需要推送
值为 4：表示只要推送主叫接听状态
值为 16191：表示所有状态都需要推送（上面所有值和）
     * @param StatusFlag 主叫发起呼叫状态：1
被叫发起呼叫状态：256
主叫响铃状态：2
被叫响铃状态：512
主叫接听状态：4
被叫接听状态：1024
主叫拒绝接听状态：8
被叫拒绝接听状态：2048
主叫正常挂机状态：16
被叫正常挂机状态：4096
主叫呼叫异常：32
被叫呼叫异常：8192

例如：
值为 0：表示所有状态不需要推送
值为 4：表示只要推送主叫接听状态
值为 16191：表示所有状态都需要推送（上面所有值和）
     */
    public void setStatusFlag(String StatusFlag) {
        this.StatusFlag = StatusFlag;
    }

    /**
     * Get 请填写statusFlag并设置值，状态回调通知地址，正式环境可以配置默认推送地址 
     * @return StatusUrl 请填写statusFlag并设置值，状态回调通知地址，正式环境可以配置默认推送地址
     */
    public String getStatusUrl() {
        return this.StatusUrl;
    }

    /**
     * Set 请填写statusFlag并设置值，状态回调通知地址，正式环境可以配置默认推送地址
     * @param StatusUrl 请填写statusFlag并设置值，状态回调通知地址，正式环境可以配置默认推送地址
     */
    public void setStatusUrl(String StatusUrl) {
        this.StatusUrl = StatusUrl;
    }

    /**
     * Get 话单回调通知地址，正式环境可以配置默认推送地址 
     * @return HangupUrl 话单回调通知地址，正式环境可以配置默认推送地址
     */
    public String getHangupUrl() {
        return this.HangupUrl;
    }

    /**
     * Set 话单回调通知地址，正式环境可以配置默认推送地址
     * @param HangupUrl 话单回调通知地址，正式环境可以配置默认推送地址
     */
    public void setHangupUrl(String HangupUrl) {
        this.HangupUrl = HangupUrl;
    }

    /**
     * Get 录单 URL 回调通知地址，正式环境可以配置默认推送地址 
     * @return RecordUrl 录单 URL 回调通知地址，正式环境可以配置默认推送地址
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 录单 URL 回调通知地址，正式环境可以配置默认推送地址
     * @param RecordUrl 录单 URL 回调通知地址，正式环境可以配置默认推送地址
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizAppId", this.BizAppId);
        this.setParamSimple(map, prefix + "Dst", this.Dst);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArraySimple(map, prefix + "AccreditList.", this.AccreditList);
        this.setParamSimple(map, prefix + "AssignVirtualNum", this.AssignVirtualNum);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "MaxAssignTime", this.MaxAssignTime);
        this.setParamSimple(map, prefix + "StatusFlag", this.StatusFlag);
        this.setParamSimple(map, prefix + "StatusUrl", this.StatusUrl);
        this.setParamSimple(map, prefix + "HangupUrl", this.HangupUrl);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);

    }
}

