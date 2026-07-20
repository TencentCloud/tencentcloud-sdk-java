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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertCenterRuleAsyncRequest extends AbstractModel {

    /**
    * <p>处置时间<br>1  1天<br>7   7天<br>-2 永久</p>
    */
    @SerializedName("HandleTime")
    @Expose
    private Long HandleTime;

    /**
    * <p>处置类型<br>当HandleIdList 不为空时：1封禁 2放通<br>当HandleIpList 不为空时：3放通 4封禁</p>
    */
    @SerializedName("HandleType")
    @Expose
    private Long HandleType;

    /**
    * <p>当前日志方向： 0 出向 1 入向</p>
    */
    @SerializedName("AlertDirection")
    @Expose
    private Long AlertDirection;

    /**
    * <p>处置方向： 0出向 1入向 0,1出入向 3内网</p>
    */
    @SerializedName("HandleDirection")
    @Expose
    private String HandleDirection;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>处置对象,ID列表，  IdLists,IpList,EventIdList三选一</p>
    */
    @SerializedName("HandleIdList")
    @Expose
    private String [] HandleIdList;

    /**
    * <p>处置对象,IP列表，  IdLists,IpList,EventIdList三选一</p>
    */
    @SerializedName("HandleIpList")
    @Expose
    private String [] HandleIpList;

    /**
    * <p>处置描述</p>
    */
    @SerializedName("HandleComment")
    @Expose
    private String HandleComment;

    /**
    * <p>放通原因:<br>0默认 1重复 2误报 3紧急放通</p>
    */
    @SerializedName("IgnoreReason")
    @Expose
    private Long IgnoreReason;

    /**
    * <p>封禁域名-保留字段</p>
    */
    @SerializedName("BlockDomain")
    @Expose
    private String BlockDomain;

    /**
    * <p>处置对象,事件ID列表，  IdLists,IpList,EventIdList三选一</p>
    */
    @SerializedName("HandleEventIdList")
    @Expose
    private String [] HandleEventIdList;

    /**
    * <p>加白IP列表 隔离时放通的ip列表</p>
    */
    @SerializedName("WhiteIpList")
    @Expose
    private String [] WhiteIpList;

    /**
    * <p>隔离类型 1 互联网入站 2 互联网出站 4 内网访问</p>
    */
    @SerializedName("IsolateType")
    @Expose
    private Long [] IsolateType;

    /**
    * <p>隔离资产列表</p>
    */
    @SerializedName("AssetIdList")
    @Expose
    private String [] AssetIdList;

    /**
    * <p>处置HandleIpList，属于的告警事件ID</p>
    */
    @SerializedName("TargetEventIdList")
    @Expose
    private String [] TargetEventIdList;

    /**
     * Get <p>处置时间<br>1  1天<br>7   7天<br>-2 永久</p> 
     * @return HandleTime <p>处置时间<br>1  1天<br>7   7天<br>-2 永久</p>
     */
    public Long getHandleTime() {
        return this.HandleTime;
    }

    /**
     * Set <p>处置时间<br>1  1天<br>7   7天<br>-2 永久</p>
     * @param HandleTime <p>处置时间<br>1  1天<br>7   7天<br>-2 永久</p>
     */
    public void setHandleTime(Long HandleTime) {
        this.HandleTime = HandleTime;
    }

    /**
     * Get <p>处置类型<br>当HandleIdList 不为空时：1封禁 2放通<br>当HandleIpList 不为空时：3放通 4封禁</p> 
     * @return HandleType <p>处置类型<br>当HandleIdList 不为空时：1封禁 2放通<br>当HandleIpList 不为空时：3放通 4封禁</p>
     */
    public Long getHandleType() {
        return this.HandleType;
    }

    /**
     * Set <p>处置类型<br>当HandleIdList 不为空时：1封禁 2放通<br>当HandleIpList 不为空时：3放通 4封禁</p>
     * @param HandleType <p>处置类型<br>当HandleIdList 不为空时：1封禁 2放通<br>当HandleIpList 不为空时：3放通 4封禁</p>
     */
    public void setHandleType(Long HandleType) {
        this.HandleType = HandleType;
    }

    /**
     * Get <p>当前日志方向： 0 出向 1 入向</p> 
     * @return AlertDirection <p>当前日志方向： 0 出向 1 入向</p>
     */
    public Long getAlertDirection() {
        return this.AlertDirection;
    }

    /**
     * Set <p>当前日志方向： 0 出向 1 入向</p>
     * @param AlertDirection <p>当前日志方向： 0 出向 1 入向</p>
     */
    public void setAlertDirection(Long AlertDirection) {
        this.AlertDirection = AlertDirection;
    }

    /**
     * Get <p>处置方向： 0出向 1入向 0,1出入向 3内网</p> 
     * @return HandleDirection <p>处置方向： 0出向 1入向 0,1出入向 3内网</p>
     */
    public String getHandleDirection() {
        return this.HandleDirection;
    }

    /**
     * Set <p>处置方向： 0出向 1入向 0,1出入向 3内网</p>
     * @param HandleDirection <p>处置方向： 0出向 1入向 0,1出入向 3内网</p>
     */
    public void setHandleDirection(String HandleDirection) {
        this.HandleDirection = HandleDirection;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul> 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>处置对象,ID列表，  IdLists,IpList,EventIdList三选一</p> 
     * @return HandleIdList <p>处置对象,ID列表，  IdLists,IpList,EventIdList三选一</p>
     */
    public String [] getHandleIdList() {
        return this.HandleIdList;
    }

    /**
     * Set <p>处置对象,ID列表，  IdLists,IpList,EventIdList三选一</p>
     * @param HandleIdList <p>处置对象,ID列表，  IdLists,IpList,EventIdList三选一</p>
     */
    public void setHandleIdList(String [] HandleIdList) {
        this.HandleIdList = HandleIdList;
    }

    /**
     * Get <p>处置对象,IP列表，  IdLists,IpList,EventIdList三选一</p> 
     * @return HandleIpList <p>处置对象,IP列表，  IdLists,IpList,EventIdList三选一</p>
     */
    public String [] getHandleIpList() {
        return this.HandleIpList;
    }

    /**
     * Set <p>处置对象,IP列表，  IdLists,IpList,EventIdList三选一</p>
     * @param HandleIpList <p>处置对象,IP列表，  IdLists,IpList,EventIdList三选一</p>
     */
    public void setHandleIpList(String [] HandleIpList) {
        this.HandleIpList = HandleIpList;
    }

    /**
     * Get <p>处置描述</p> 
     * @return HandleComment <p>处置描述</p>
     */
    public String getHandleComment() {
        return this.HandleComment;
    }

    /**
     * Set <p>处置描述</p>
     * @param HandleComment <p>处置描述</p>
     */
    public void setHandleComment(String HandleComment) {
        this.HandleComment = HandleComment;
    }

    /**
     * Get <p>放通原因:<br>0默认 1重复 2误报 3紧急放通</p> 
     * @return IgnoreReason <p>放通原因:<br>0默认 1重复 2误报 3紧急放通</p>
     */
    public Long getIgnoreReason() {
        return this.IgnoreReason;
    }

    /**
     * Set <p>放通原因:<br>0默认 1重复 2误报 3紧急放通</p>
     * @param IgnoreReason <p>放通原因:<br>0默认 1重复 2误报 3紧急放通</p>
     */
    public void setIgnoreReason(Long IgnoreReason) {
        this.IgnoreReason = IgnoreReason;
    }

    /**
     * Get <p>封禁域名-保留字段</p> 
     * @return BlockDomain <p>封禁域名-保留字段</p>
     */
    public String getBlockDomain() {
        return this.BlockDomain;
    }

    /**
     * Set <p>封禁域名-保留字段</p>
     * @param BlockDomain <p>封禁域名-保留字段</p>
     */
    public void setBlockDomain(String BlockDomain) {
        this.BlockDomain = BlockDomain;
    }

    /**
     * Get <p>处置对象,事件ID列表，  IdLists,IpList,EventIdList三选一</p> 
     * @return HandleEventIdList <p>处置对象,事件ID列表，  IdLists,IpList,EventIdList三选一</p>
     */
    public String [] getHandleEventIdList() {
        return this.HandleEventIdList;
    }

    /**
     * Set <p>处置对象,事件ID列表，  IdLists,IpList,EventIdList三选一</p>
     * @param HandleEventIdList <p>处置对象,事件ID列表，  IdLists,IpList,EventIdList三选一</p>
     */
    public void setHandleEventIdList(String [] HandleEventIdList) {
        this.HandleEventIdList = HandleEventIdList;
    }

    /**
     * Get <p>加白IP列表 隔离时放通的ip列表</p> 
     * @return WhiteIpList <p>加白IP列表 隔离时放通的ip列表</p>
     */
    public String [] getWhiteIpList() {
        return this.WhiteIpList;
    }

    /**
     * Set <p>加白IP列表 隔离时放通的ip列表</p>
     * @param WhiteIpList <p>加白IP列表 隔离时放通的ip列表</p>
     */
    public void setWhiteIpList(String [] WhiteIpList) {
        this.WhiteIpList = WhiteIpList;
    }

    /**
     * Get <p>隔离类型 1 互联网入站 2 互联网出站 4 内网访问</p> 
     * @return IsolateType <p>隔离类型 1 互联网入站 2 互联网出站 4 内网访问</p>
     */
    public Long [] getIsolateType() {
        return this.IsolateType;
    }

    /**
     * Set <p>隔离类型 1 互联网入站 2 互联网出站 4 内网访问</p>
     * @param IsolateType <p>隔离类型 1 互联网入站 2 互联网出站 4 内网访问</p>
     */
    public void setIsolateType(Long [] IsolateType) {
        this.IsolateType = IsolateType;
    }

    /**
     * Get <p>隔离资产列表</p> 
     * @return AssetIdList <p>隔离资产列表</p>
     */
    public String [] getAssetIdList() {
        return this.AssetIdList;
    }

    /**
     * Set <p>隔离资产列表</p>
     * @param AssetIdList <p>隔离资产列表</p>
     */
    public void setAssetIdList(String [] AssetIdList) {
        this.AssetIdList = AssetIdList;
    }

    /**
     * Get <p>处置HandleIpList，属于的告警事件ID</p> 
     * @return TargetEventIdList <p>处置HandleIpList，属于的告警事件ID</p>
     */
    public String [] getTargetEventIdList() {
        return this.TargetEventIdList;
    }

    /**
     * Set <p>处置HandleIpList，属于的告警事件ID</p>
     * @param TargetEventIdList <p>处置HandleIpList，属于的告警事件ID</p>
     */
    public void setTargetEventIdList(String [] TargetEventIdList) {
        this.TargetEventIdList = TargetEventIdList;
    }

    public CreateAlertCenterRuleAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterRuleAsyncRequest(CreateAlertCenterRuleAsyncRequest source) {
        if (source.HandleTime != null) {
            this.HandleTime = new Long(source.HandleTime);
        }
        if (source.HandleType != null) {
            this.HandleType = new Long(source.HandleType);
        }
        if (source.AlertDirection != null) {
            this.AlertDirection = new Long(source.AlertDirection);
        }
        if (source.HandleDirection != null) {
            this.HandleDirection = new String(source.HandleDirection);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.HandleIdList != null) {
            this.HandleIdList = new String[source.HandleIdList.length];
            for (int i = 0; i < source.HandleIdList.length; i++) {
                this.HandleIdList[i] = new String(source.HandleIdList[i]);
            }
        }
        if (source.HandleIpList != null) {
            this.HandleIpList = new String[source.HandleIpList.length];
            for (int i = 0; i < source.HandleIpList.length; i++) {
                this.HandleIpList[i] = new String(source.HandleIpList[i]);
            }
        }
        if (source.HandleComment != null) {
            this.HandleComment = new String(source.HandleComment);
        }
        if (source.IgnoreReason != null) {
            this.IgnoreReason = new Long(source.IgnoreReason);
        }
        if (source.BlockDomain != null) {
            this.BlockDomain = new String(source.BlockDomain);
        }
        if (source.HandleEventIdList != null) {
            this.HandleEventIdList = new String[source.HandleEventIdList.length];
            for (int i = 0; i < source.HandleEventIdList.length; i++) {
                this.HandleEventIdList[i] = new String(source.HandleEventIdList[i]);
            }
        }
        if (source.WhiteIpList != null) {
            this.WhiteIpList = new String[source.WhiteIpList.length];
            for (int i = 0; i < source.WhiteIpList.length; i++) {
                this.WhiteIpList[i] = new String(source.WhiteIpList[i]);
            }
        }
        if (source.IsolateType != null) {
            this.IsolateType = new Long[source.IsolateType.length];
            for (int i = 0; i < source.IsolateType.length; i++) {
                this.IsolateType[i] = new Long(source.IsolateType[i]);
            }
        }
        if (source.AssetIdList != null) {
            this.AssetIdList = new String[source.AssetIdList.length];
            for (int i = 0; i < source.AssetIdList.length; i++) {
                this.AssetIdList[i] = new String(source.AssetIdList[i]);
            }
        }
        if (source.TargetEventIdList != null) {
            this.TargetEventIdList = new String[source.TargetEventIdList.length];
            for (int i = 0; i < source.TargetEventIdList.length; i++) {
                this.TargetEventIdList[i] = new String(source.TargetEventIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HandleTime", this.HandleTime);
        this.setParamSimple(map, prefix + "HandleType", this.HandleType);
        this.setParamSimple(map, prefix + "AlertDirection", this.AlertDirection);
        this.setParamSimple(map, prefix + "HandleDirection", this.HandleDirection);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamArraySimple(map, prefix + "HandleIdList.", this.HandleIdList);
        this.setParamArraySimple(map, prefix + "HandleIpList.", this.HandleIpList);
        this.setParamSimple(map, prefix + "HandleComment", this.HandleComment);
        this.setParamSimple(map, prefix + "IgnoreReason", this.IgnoreReason);
        this.setParamSimple(map, prefix + "BlockDomain", this.BlockDomain);
        this.setParamArraySimple(map, prefix + "HandleEventIdList.", this.HandleEventIdList);
        this.setParamArraySimple(map, prefix + "WhiteIpList.", this.WhiteIpList);
        this.setParamArraySimple(map, prefix + "IsolateType.", this.IsolateType);
        this.setParamArraySimple(map, prefix + "AssetIdList.", this.AssetIdList);
        this.setParamArraySimple(map, prefix + "TargetEventIdList.", this.TargetEventIdList);

    }
}

