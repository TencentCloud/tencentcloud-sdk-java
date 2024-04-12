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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttributeLabelRequest extends AbstractModel {

    /**
    * 机器人ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 属性ID
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * 每次加载的数量 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 登录用户主账号(集成商模式必填)
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 登录用户子账号(集成商模式必填)
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * 查询标签或相似标签
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 滚动加载游标的标签ID
    */
    @SerializedName("LastLabelBizId")
    @Expose
    private String LastLabelBizId;

    /**
     * Get 机器人ID 
     * @return BotBizId 机器人ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 机器人ID
     * @param BotBizId 机器人ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 属性ID 
     * @return AttributeBizId 属性ID
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set 属性ID
     * @param AttributeBizId 属性ID
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get 每次加载的数量  
     * @return Limit 每次加载的数量 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次加载的数量 
     * @param Limit 每次加载的数量 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 登录用户主账号(集成商模式必填) 
     * @return LoginUin 登录用户主账号(集成商模式必填)
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 登录用户主账号(集成商模式必填)
     * @param LoginUin 登录用户主账号(集成商模式必填)
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 登录用户子账号(集成商模式必填) 
     * @return LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 登录用户子账号(集成商模式必填)
     * @param LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get 查询标签或相似标签 
     * @return Query 查询标签或相似标签
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询标签或相似标签
     * @param Query 查询标签或相似标签
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 滚动加载游标的标签ID 
     * @return LastLabelBizId 滚动加载游标的标签ID
     */
    public String getLastLabelBizId() {
        return this.LastLabelBizId;
    }

    /**
     * Set 滚动加载游标的标签ID
     * @param LastLabelBizId 滚动加载游标的标签ID
     */
    public void setLastLabelBizId(String LastLabelBizId) {
        this.LastLabelBizId = LastLabelBizId;
    }

    public DescribeAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttributeLabelRequest(DescribeAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.LastLabelBizId != null) {
            this.LastLabelBizId = new String(source.LastLabelBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "LastLabelBizId", this.LastLabelBizId);

    }
}

