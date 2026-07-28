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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardRecord extends AbstractModel {

    /**
    * <p>转交人打码后的姓名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>转交人打码后的手机号</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>进行转交的原因</p><p>枚举值：</p><ul><li>QUIT_FORWARD： 离职转交</li><li>FORWARD： 员工操作转交</li></ul>
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * <p>转交的详情信息</p>
    */
    @SerializedName("ForwardMessage")
    @Expose
    private String ForwardMessage;

    /**
    * <p>转交时间</p><p>单位：时间戳（秒级）</p>
    */
    @SerializedName("ForwardTime")
    @Expose
    private Long ForwardTime;

    /**
     * Get <p>转交人打码后的姓名</p> 
     * @return Name <p>转交人打码后的姓名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>转交人打码后的姓名</p>
     * @param Name <p>转交人打码后的姓名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>转交人打码后的手机号</p> 
     * @return Mobile <p>转交人打码后的手机号</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>转交人打码后的手机号</p>
     * @param Mobile <p>转交人打码后的手机号</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>进行转交的原因</p><p>枚举值：</p><ul><li>QUIT_FORWARD： 离职转交</li><li>FORWARD： 员工操作转交</li></ul> 
     * @return ForwardType <p>进行转交的原因</p><p>枚举值：</p><ul><li>QUIT_FORWARD： 离职转交</li><li>FORWARD： 员工操作转交</li></ul>
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set <p>进行转交的原因</p><p>枚举值：</p><ul><li>QUIT_FORWARD： 离职转交</li><li>FORWARD： 员工操作转交</li></ul>
     * @param ForwardType <p>进行转交的原因</p><p>枚举值：</p><ul><li>QUIT_FORWARD： 离职转交</li><li>FORWARD： 员工操作转交</li></ul>
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * Get <p>转交的详情信息</p> 
     * @return ForwardMessage <p>转交的详情信息</p>
     */
    public String getForwardMessage() {
        return this.ForwardMessage;
    }

    /**
     * Set <p>转交的详情信息</p>
     * @param ForwardMessage <p>转交的详情信息</p>
     */
    public void setForwardMessage(String ForwardMessage) {
        this.ForwardMessage = ForwardMessage;
    }

    /**
     * Get <p>转交时间</p><p>单位：时间戳（秒级）</p> 
     * @return ForwardTime <p>转交时间</p><p>单位：时间戳（秒级）</p>
     */
    public Long getForwardTime() {
        return this.ForwardTime;
    }

    /**
     * Set <p>转交时间</p><p>单位：时间戳（秒级）</p>
     * @param ForwardTime <p>转交时间</p><p>单位：时间戳（秒级）</p>
     */
    public void setForwardTime(Long ForwardTime) {
        this.ForwardTime = ForwardTime;
    }

    public ForwardRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardRecord(ForwardRecord source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.ForwardType != null) {
            this.ForwardType = new String(source.ForwardType);
        }
        if (source.ForwardMessage != null) {
            this.ForwardMessage = new String(source.ForwardMessage);
        }
        if (source.ForwardTime != null) {
            this.ForwardTime = new Long(source.ForwardTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "ForwardMessage", this.ForwardMessage);
        this.setParamSimple(map, prefix + "ForwardTime", this.ForwardTime);

    }
}

