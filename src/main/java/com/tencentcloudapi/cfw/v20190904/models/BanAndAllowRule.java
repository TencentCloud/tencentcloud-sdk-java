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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BanAndAllowRule extends AbstractModel {

    /**
    * 规则评论
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 自定义白名单规则
    */
    @SerializedName("CustomRule")
    @Expose
    private CustomWhiteRule CustomRule;

    /**
    * 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
    */
    @SerializedName("DirectionList")
    @Expose
    private String DirectionList;

    /**
    * 规则截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 放通的引擎: 1针对互联网边界 2针对nat防火墙 4针对vpc防火墙
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
    * 封禁和放通对象
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
     * Get 规则评论 
     * @return Comment 规则评论
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 规则评论
     * @param Comment 规则评论
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 自定义白名单规则 
     * @return CustomRule 自定义白名单规则
     */
    public CustomWhiteRule getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义白名单规则
     * @param CustomRule 自定义白名单规则
     */
    public void setCustomRule(CustomWhiteRule CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get 0互联网出站 1互联网入站 5内网访问源 6内网访问目的 
     * @return DirectionList 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
     */
    public String getDirectionList() {
        return this.DirectionList;
    }

    /**
     * Set 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
     * @param DirectionList 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
     */
    public void setDirectionList(String DirectionList) {
        this.DirectionList = DirectionList;
    }

    /**
     * Get 规则截止时间 
     * @return EndTime 规则截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 规则截止时间
     * @param EndTime 规则截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 放通的引擎: 1针对互联网边界 2针对nat防火墙 4针对vpc防火墙 
     * @return FwType 放通的引擎: 1针对互联网边界 2针对nat防火墙 4针对vpc防火墙
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set 放通的引擎: 1针对互联网边界 2针对nat防火墙 4针对vpc防火墙
     * @param FwType 放通的引擎: 1针对互联网边界 2针对nat防火墙 4针对vpc防火墙
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 封禁和放通对象 
     * @return Ioc 封禁和放通对象
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 封禁和放通对象
     * @param Ioc 封禁和放通对象
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    public BanAndAllowRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanAndAllowRule(BanAndAllowRule source) {
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new CustomWhiteRule(source.CustomRule);
        }
        if (source.DirectionList != null) {
            this.DirectionList = new String(source.DirectionList);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "CustomRule.", this.CustomRule);
        this.setParamSimple(map, prefix + "DirectionList", this.DirectionList);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);

    }
}

