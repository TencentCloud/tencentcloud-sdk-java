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

public class AccessKeyWhiteList extends AbstractModel {

    /**
    * 白名单ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 白名单策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ak加白列表
    */
    @SerializedName("AKList")
    @Expose
    private String [] AKList;

    /**
    * ip加白列表
    */
    @SerializedName("IPList")
    @Expose
    private String [] IPList;

    /**
    * ip类型列表 IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注) 4:局域网（未备注）5:局域网（已备注）
    */
    @SerializedName("IPTypeList")
    @Expose
    private Long [] IPTypeList;

    /**
    * 接口加白列表
    */
    @SerializedName("ActionList")
    @Expose
    private String [] ActionList;

    /**
    * 调用方式加白
0 全部调用方式
1 控制台
2 API
-1 不存在
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * 错误码白名单（其他错误码待补充）
0 成功

    */
    @SerializedName("ErrorCodeList")
    @Expose
    private Long [] ErrorCodeList;

    /**
    * 策略内容/描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * ak输入类型 
0:从现有选择
1:手动输入
2:临时密钥
3:长期密钥
4:全部密钥
-1:无
    */
    @SerializedName("AkImportType")
    @Expose
    private Long AkImportType;

    /**
    * 主账号AppID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 所属主账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 所属主账号 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 是否处理过去的告警
    */
    @SerializedName("NeedDealPastAlarm")
    @Expose
    private Boolean NeedDealPastAlarm;

    /**
    * 处理状态
0 处理完成
1 正在处理
    */
    @SerializedName("DealStatus")
    @Expose
    private Long DealStatus;

    /**
    * 接口选择
0:自定义输入
1:产品+接口形式交互选择
2:全部接口
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 绑定策略id列表，为空代表全局生效
    */
    @SerializedName("AlarmPolicyID")
    @Expose
    private Long [] AlarmPolicyID;

    /**
     * Get 白名单ID 
     * @return ID 白名单ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 白名单ID
     * @param ID 白名单ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 白名单策略名称 
     * @return Name 白名单策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 白名单策略名称
     * @param Name 白名单策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ak加白列表 
     * @return AKList ak加白列表
     */
    public String [] getAKList() {
        return this.AKList;
    }

    /**
     * Set ak加白列表
     * @param AKList ak加白列表
     */
    public void setAKList(String [] AKList) {
        this.AKList = AKList;
    }

    /**
     * Get ip加白列表 
     * @return IPList ip加白列表
     */
    public String [] getIPList() {
        return this.IPList;
    }

    /**
     * Set ip加白列表
     * @param IPList ip加白列表
     */
    public void setIPList(String [] IPList) {
        this.IPList = IPList;
    }

    /**
     * Get ip类型列表 IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注) 4:局域网（未备注）5:局域网（已备注） 
     * @return IPTypeList ip类型列表 IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注) 4:局域网（未备注）5:局域网（已备注）
     */
    public Long [] getIPTypeList() {
        return this.IPTypeList;
    }

    /**
     * Set ip类型列表 IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注) 4:局域网（未备注）5:局域网（已备注）
     * @param IPTypeList ip类型列表 IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注) 4:局域网（未备注）5:局域网（已备注）
     */
    public void setIPTypeList(Long [] IPTypeList) {
        this.IPTypeList = IPTypeList;
    }

    /**
     * Get 接口加白列表 
     * @return ActionList 接口加白列表
     */
    public String [] getActionList() {
        return this.ActionList;
    }

    /**
     * Set 接口加白列表
     * @param ActionList 接口加白列表
     */
    public void setActionList(String [] ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get 调用方式加白
0 全部调用方式
1 控制台
2 API
-1 不存在 
     * @return CallType 调用方式加白
0 全部调用方式
1 控制台
2 API
-1 不存在
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set 调用方式加白
0 全部调用方式
1 控制台
2 API
-1 不存在
     * @param CallType 调用方式加白
0 全部调用方式
1 控制台
2 API
-1 不存在
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 错误码白名单（其他错误码待补充）
0 成功
 
     * @return ErrorCodeList 错误码白名单（其他错误码待补充）
0 成功

     */
    public Long [] getErrorCodeList() {
        return this.ErrorCodeList;
    }

    /**
     * Set 错误码白名单（其他错误码待补充）
0 成功

     * @param ErrorCodeList 错误码白名单（其他错误码待补充）
0 成功

     */
    public void setErrorCodeList(Long [] ErrorCodeList) {
        this.ErrorCodeList = ErrorCodeList;
    }

    /**
     * Get 策略内容/描述 
     * @return Remark 策略内容/描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 策略内容/描述
     * @param Remark 策略内容/描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get ak输入类型 
0:从现有选择
1:手动输入
2:临时密钥
3:长期密钥
4:全部密钥
-1:无 
     * @return AkImportType ak输入类型 
0:从现有选择
1:手动输入
2:临时密钥
3:长期密钥
4:全部密钥
-1:无
     */
    public Long getAkImportType() {
        return this.AkImportType;
    }

    /**
     * Set ak输入类型 
0:从现有选择
1:手动输入
2:临时密钥
3:长期密钥
4:全部密钥
-1:无
     * @param AkImportType ak输入类型 
0:从现有选择
1:手动输入
2:临时密钥
3:长期密钥
4:全部密钥
-1:无
     */
    public void setAkImportType(Long AkImportType) {
        this.AkImportType = AkImportType;
    }

    /**
     * Get 主账号AppID 
     * @return AppID 主账号AppID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 主账号AppID
     * @param AppID 主账号AppID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 所属主账号uin 
     * @return Uin 所属主账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 所属主账号uin
     * @param Uin 所属主账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 所属主账号 昵称 
     * @return Nickname 所属主账号 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 所属主账号 昵称
     * @param Nickname 所属主账号 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 是否处理过去的告警 
     * @return NeedDealPastAlarm 是否处理过去的告警
     */
    public Boolean getNeedDealPastAlarm() {
        return this.NeedDealPastAlarm;
    }

    /**
     * Set 是否处理过去的告警
     * @param NeedDealPastAlarm 是否处理过去的告警
     */
    public void setNeedDealPastAlarm(Boolean NeedDealPastAlarm) {
        this.NeedDealPastAlarm = NeedDealPastAlarm;
    }

    /**
     * Get 处理状态
0 处理完成
1 正在处理 
     * @return DealStatus 处理状态
0 处理完成
1 正在处理
     */
    public Long getDealStatus() {
        return this.DealStatus;
    }

    /**
     * Set 处理状态
0 处理完成
1 正在处理
     * @param DealStatus 处理状态
0 处理完成
1 正在处理
     */
    public void setDealStatus(Long DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * Get 接口选择
0:自定义输入
1:产品+接口形式交互选择
2:全部接口 
     * @return ActionType 接口选择
0:自定义输入
1:产品+接口形式交互选择
2:全部接口
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 接口选择
0:自定义输入
1:产品+接口形式交互选择
2:全部接口
     * @param ActionType 接口选择
0:自定义输入
1:产品+接口形式交互选择
2:全部接口
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 绑定策略id列表，为空代表全局生效 
     * @return AlarmPolicyID 绑定策略id列表，为空代表全局生效
     */
    public Long [] getAlarmPolicyID() {
        return this.AlarmPolicyID;
    }

    /**
     * Set 绑定策略id列表，为空代表全局生效
     * @param AlarmPolicyID 绑定策略id列表，为空代表全局生效
     */
    public void setAlarmPolicyID(Long [] AlarmPolicyID) {
        this.AlarmPolicyID = AlarmPolicyID;
    }

    public AccessKeyWhiteList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyWhiteList(AccessKeyWhiteList source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AKList != null) {
            this.AKList = new String[source.AKList.length];
            for (int i = 0; i < source.AKList.length; i++) {
                this.AKList[i] = new String(source.AKList[i]);
            }
        }
        if (source.IPList != null) {
            this.IPList = new String[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new String(source.IPList[i]);
            }
        }
        if (source.IPTypeList != null) {
            this.IPTypeList = new Long[source.IPTypeList.length];
            for (int i = 0; i < source.IPTypeList.length; i++) {
                this.IPTypeList[i] = new Long(source.IPTypeList[i]);
            }
        }
        if (source.ActionList != null) {
            this.ActionList = new String[source.ActionList.length];
            for (int i = 0; i < source.ActionList.length; i++) {
                this.ActionList[i] = new String(source.ActionList[i]);
            }
        }
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.ErrorCodeList != null) {
            this.ErrorCodeList = new Long[source.ErrorCodeList.length];
            for (int i = 0; i < source.ErrorCodeList.length; i++) {
                this.ErrorCodeList[i] = new Long(source.ErrorCodeList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AkImportType != null) {
            this.AkImportType = new Long(source.AkImportType);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.NeedDealPastAlarm != null) {
            this.NeedDealPastAlarm = new Boolean(source.NeedDealPastAlarm);
        }
        if (source.DealStatus != null) {
            this.DealStatus = new Long(source.DealStatus);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.AlarmPolicyID != null) {
            this.AlarmPolicyID = new Long[source.AlarmPolicyID.length];
            for (int i = 0; i < source.AlarmPolicyID.length; i++) {
                this.AlarmPolicyID[i] = new Long(source.AlarmPolicyID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AKList.", this.AKList);
        this.setParamArraySimple(map, prefix + "IPList.", this.IPList);
        this.setParamArraySimple(map, prefix + "IPTypeList.", this.IPTypeList);
        this.setParamArraySimple(map, prefix + "ActionList.", this.ActionList);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamArraySimple(map, prefix + "ErrorCodeList.", this.ErrorCodeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AkImportType", this.AkImportType);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "NeedDealPastAlarm", this.NeedDealPastAlarm);
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamArraySimple(map, prefix + "AlarmPolicyID.", this.AlarmPolicyID);

    }
}

