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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UebaCustomRule extends AbstractModel {

    /**
    * 策略名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 1: 云账号
2: 自定义用户
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 发生时间
1：10分钟
2：1小时
3：一天
4：一周
5：一个月
    */
    @SerializedName("TimeInterval")
    @Expose
    private Long TimeInterval;

    /**
    * 发生事件
    */
    @SerializedName("EventContent")
    @Expose
    private UebaEventContent EventContent;

    /**
    * 告警名称
    */
    @SerializedName("AlertName")
    @Expose
    private String AlertName;

    /**
    * 告警类型
0:  提示
1:  低危
2:  中危
3:  高危
4:  严重
    */
    @SerializedName("AlterLevel")
    @Expose
    private Long AlterLevel;

    /**
    * 操作者
    */
    @SerializedName("Operator")
    @Expose
    private String [] Operator;

    /**
    * 操作对象
    */
    @SerializedName("OperateObject")
    @Expose
    private String [] OperateObject;

    /**
    * 操作方式
    */
    @SerializedName("OperateMethod")
    @Expose
    private String [] OperateMethod;

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 日志中文名
    */
    @SerializedName("LogTypeStr")
    @Expose
    private String LogTypeStr;

    /**
     * Get 策略名称 
     * @return RuleName 策略名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 策略名称
     * @param RuleName 策略名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 1: 云账号
2: 自定义用户 
     * @return UserType 1: 云账号
2: 自定义用户
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 1: 云账号
2: 自定义用户
     * @param UserType 1: 云账号
2: 自定义用户
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 发生时间
1：10分钟
2：1小时
3：一天
4：一周
5：一个月 
     * @return TimeInterval 发生时间
1：10分钟
2：1小时
3：一天
4：一周
5：一个月
     */
    public Long getTimeInterval() {
        return this.TimeInterval;
    }

    /**
     * Set 发生时间
1：10分钟
2：1小时
3：一天
4：一周
5：一个月
     * @param TimeInterval 发生时间
1：10分钟
2：1小时
3：一天
4：一周
5：一个月
     */
    public void setTimeInterval(Long TimeInterval) {
        this.TimeInterval = TimeInterval;
    }

    /**
     * Get 发生事件 
     * @return EventContent 发生事件
     */
    public UebaEventContent getEventContent() {
        return this.EventContent;
    }

    /**
     * Set 发生事件
     * @param EventContent 发生事件
     */
    public void setEventContent(UebaEventContent EventContent) {
        this.EventContent = EventContent;
    }

    /**
     * Get 告警名称 
     * @return AlertName 告警名称
     */
    public String getAlertName() {
        return this.AlertName;
    }

    /**
     * Set 告警名称
     * @param AlertName 告警名称
     */
    public void setAlertName(String AlertName) {
        this.AlertName = AlertName;
    }

    /**
     * Get 告警类型
0:  提示
1:  低危
2:  中危
3:  高危
4:  严重 
     * @return AlterLevel 告警类型
0:  提示
1:  低危
2:  中危
3:  高危
4:  严重
     */
    public Long getAlterLevel() {
        return this.AlterLevel;
    }

    /**
     * Set 告警类型
0:  提示
1:  低危
2:  中危
3:  高危
4:  严重
     * @param AlterLevel 告警类型
0:  提示
1:  低危
2:  中危
3:  高危
4:  严重
     */
    public void setAlterLevel(Long AlterLevel) {
        this.AlterLevel = AlterLevel;
    }

    /**
     * Get 操作者 
     * @return Operator 操作者
     */
    public String [] getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者
     * @param Operator 操作者
     */
    public void setOperator(String [] Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 操作对象 
     * @return OperateObject 操作对象
     */
    public String [] getOperateObject() {
        return this.OperateObject;
    }

    /**
     * Set 操作对象
     * @param OperateObject 操作对象
     */
    public void setOperateObject(String [] OperateObject) {
        this.OperateObject = OperateObject;
    }

    /**
     * Get 操作方式 
     * @return OperateMethod 操作方式
     */
    public String [] getOperateMethod() {
        return this.OperateMethod;
    }

    /**
     * Set 操作方式
     * @param OperateMethod 操作方式
     */
    public void setOperateMethod(String [] OperateMethod) {
        this.OperateMethod = OperateMethod;
    }

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 日志中文名 
     * @return LogTypeStr 日志中文名
     */
    public String getLogTypeStr() {
        return this.LogTypeStr;
    }

    /**
     * Set 日志中文名
     * @param LogTypeStr 日志中文名
     */
    public void setLogTypeStr(String LogTypeStr) {
        this.LogTypeStr = LogTypeStr;
    }

    public UebaCustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaCustomRule(UebaCustomRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.TimeInterval != null) {
            this.TimeInterval = new Long(source.TimeInterval);
        }
        if (source.EventContent != null) {
            this.EventContent = new UebaEventContent(source.EventContent);
        }
        if (source.AlertName != null) {
            this.AlertName = new String(source.AlertName);
        }
        if (source.AlterLevel != null) {
            this.AlterLevel = new Long(source.AlterLevel);
        }
        if (source.Operator != null) {
            this.Operator = new String[source.Operator.length];
            for (int i = 0; i < source.Operator.length; i++) {
                this.Operator[i] = new String(source.Operator[i]);
            }
        }
        if (source.OperateObject != null) {
            this.OperateObject = new String[source.OperateObject.length];
            for (int i = 0; i < source.OperateObject.length; i++) {
                this.OperateObject[i] = new String(source.OperateObject[i]);
            }
        }
        if (source.OperateMethod != null) {
            this.OperateMethod = new String[source.OperateMethod.length];
            for (int i = 0; i < source.OperateMethod.length; i++) {
                this.OperateMethod[i] = new String(source.OperateMethod[i]);
            }
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogTypeStr != null) {
            this.LogTypeStr = new String(source.LogTypeStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "TimeInterval", this.TimeInterval);
        this.setParamObj(map, prefix + "EventContent.", this.EventContent);
        this.setParamSimple(map, prefix + "AlertName", this.AlertName);
        this.setParamSimple(map, prefix + "AlterLevel", this.AlterLevel);
        this.setParamArraySimple(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "OperateObject.", this.OperateObject);
        this.setParamArraySimple(map, prefix + "OperateMethod.", this.OperateMethod);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogTypeStr", this.LogTypeStr);

    }
}

