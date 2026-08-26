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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpsertSessionRequest extends AbstractModel {

    /**
    * 域名
入参限制：必填，必须为合法域名格式
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 会话来源位置
取值说明：get-从URL查询参数中提取，post-从POST Body中提取，cookie-从Cookie中提取，header-从HTTP Header中提取
入参限制：必填，取值范围为get/post/cookie/header
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 提取类别
取值说明：location-按位置提取（使用StartOffset和EndOffset），match-按字符串匹配提取（使用KeyOrStartMat和EndMat），exact_key-按精准Key提取（使用Key字段）
入参限制：必填，取值范围为location/match/exact_key
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 提取key或者起始匹配模式
入参限制：最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的起始字符串；当Category为exact_key时，表示精确匹配的key名
    */
    @SerializedName("KeyOrStartMat")
    @Expose
    private String KeyOrStartMat;

    /**
    * 结束匹配模式
入参限制：必填，最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的结束字符串
    */
    @SerializedName("EndMat")
    @Expose
    private String EndMat;

    /**
    * 起始偏移位置
入参限制：必填，整数字符串
约束条件：EndOffset不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的起始字节位置
    */
    @SerializedName("StartOffset")
    @Expose
    private String StartOffset;

    /**
    * 结束偏移位置
入参限制：必填，整数字符串
约束条件：不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的结束字节位置
    */
    @SerializedName("EndOffset")
    @Expose
    private String EndOffset;

    /**
    * 版本
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 会话名称
说明：用于标识会话的可读名称
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * 会话ID
说明：传-1表示新增会话（系统自动生成ID），传已有ID表示更新该会话配置
约束条件：新增时每个域名最多10条会话规则
    */
    @SerializedName("SessionID")
    @Expose
    private Long SessionID;

    /**
    * 会话标识参数（精准匹配key）
入参限制：key中"."分隔的层级不超过2层
说明：当Category为exact_key时使用，表示要精确匹配的参数名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 域名
入参限制：必填，必须为合法域名格式 
     * @return Domain 域名
入参限制：必填，必须为合法域名格式
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
入参限制：必填，必须为合法域名格式
     * @param Domain 域名
入参限制：必填，必须为合法域名格式
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 会话来源位置
取值说明：get-从URL查询参数中提取，post-从POST Body中提取，cookie-从Cookie中提取，header-从HTTP Header中提取
入参限制：必填，取值范围为get/post/cookie/header 
     * @return Source 会话来源位置
取值说明：get-从URL查询参数中提取，post-从POST Body中提取，cookie-从Cookie中提取，header-从HTTP Header中提取
入参限制：必填，取值范围为get/post/cookie/header
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 会话来源位置
取值说明：get-从URL查询参数中提取，post-从POST Body中提取，cookie-从Cookie中提取，header-从HTTP Header中提取
入参限制：必填，取值范围为get/post/cookie/header
     * @param Source 会话来源位置
取值说明：get-从URL查询参数中提取，post-从POST Body中提取，cookie-从Cookie中提取，header-从HTTP Header中提取
入参限制：必填，取值范围为get/post/cookie/header
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 提取类别
取值说明：location-按位置提取（使用StartOffset和EndOffset），match-按字符串匹配提取（使用KeyOrStartMat和EndMat），exact_key-按精准Key提取（使用Key字段）
入参限制：必填，取值范围为location/match/exact_key 
     * @return Category 提取类别
取值说明：location-按位置提取（使用StartOffset和EndOffset），match-按字符串匹配提取（使用KeyOrStartMat和EndMat），exact_key-按精准Key提取（使用Key字段）
入参限制：必填，取值范围为location/match/exact_key
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 提取类别
取值说明：location-按位置提取（使用StartOffset和EndOffset），match-按字符串匹配提取（使用KeyOrStartMat和EndMat），exact_key-按精准Key提取（使用Key字段）
入参限制：必填，取值范围为location/match/exact_key
     * @param Category 提取类别
取值说明：location-按位置提取（使用StartOffset和EndOffset），match-按字符串匹配提取（使用KeyOrStartMat和EndMat），exact_key-按精准Key提取（使用Key字段）
入参限制：必填，取值范围为location/match/exact_key
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 提取key或者起始匹配模式
入参限制：最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的起始字符串；当Category为exact_key时，表示精确匹配的key名 
     * @return KeyOrStartMat 提取key或者起始匹配模式
入参限制：最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的起始字符串；当Category为exact_key时，表示精确匹配的key名
     */
    public String getKeyOrStartMat() {
        return this.KeyOrStartMat;
    }

    /**
     * Set 提取key或者起始匹配模式
入参限制：最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的起始字符串；当Category为exact_key时，表示精确匹配的key名
     * @param KeyOrStartMat 提取key或者起始匹配模式
入参限制：最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的起始字符串；当Category为exact_key时，表示精确匹配的key名
     */
    public void setKeyOrStartMat(String KeyOrStartMat) {
        this.KeyOrStartMat = KeyOrStartMat;
    }

    /**
     * Get 结束匹配模式
入参限制：必填，最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的结束字符串 
     * @return EndMat 结束匹配模式
入参限制：必填，最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的结束字符串
     */
    public String getEndMat() {
        return this.EndMat;
    }

    /**
     * Set 结束匹配模式
入参限制：必填，最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的结束字符串
     * @param EndMat 结束匹配模式
入参限制：必填，最长32个字符，不允许包含MongoDB注入字符
说明：当Category为match时，表示匹配的结束字符串
     */
    public void setEndMat(String EndMat) {
        this.EndMat = EndMat;
    }

    /**
     * Get 起始偏移位置
入参限制：必填，整数字符串
约束条件：EndOffset不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的起始字节位置 
     * @return StartOffset 起始偏移位置
入参限制：必填，整数字符串
约束条件：EndOffset不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的起始字节位置
     */
    public String getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set 起始偏移位置
入参限制：必填，整数字符串
约束条件：EndOffset不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的起始字节位置
     * @param StartOffset 起始偏移位置
入参限制：必填，整数字符串
约束条件：EndOffset不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的起始字节位置
     */
    public void setStartOffset(String StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get 结束偏移位置
入参限制：必填，整数字符串
约束条件：不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的结束字节位置 
     * @return EndOffset 结束偏移位置
入参限制：必填，整数字符串
约束条件：不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的结束字节位置
     */
    public String getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set 结束偏移位置
入参限制：必填，整数字符串
约束条件：不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的结束字节位置
     * @param EndOffset 结束偏移位置
入参限制：必填，整数字符串
约束条件：不能小于StartOffset，且EndOffset-StartOffset+1不能超过256
说明：当Category为location时生效，表示从会话值中提取的结束字节位置
     */
    public void setEndOffset(String EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get 版本 
     * @return Edition 版本
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 版本
     * @param Edition 版本
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 会话名称
说明：用于标识会话的可读名称 
     * @return SessionName 会话名称
说明：用于标识会话的可读名称
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set 会话名称
说明：用于标识会话的可读名称
     * @param SessionName 会话名称
说明：用于标识会话的可读名称
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get 会话ID
说明：传-1表示新增会话（系统自动生成ID），传已有ID表示更新该会话配置
约束条件：新增时每个域名最多10条会话规则 
     * @return SessionID 会话ID
说明：传-1表示新增会话（系统自动生成ID），传已有ID表示更新该会话配置
约束条件：新增时每个域名最多10条会话规则
     */
    public Long getSessionID() {
        return this.SessionID;
    }

    /**
     * Set 会话ID
说明：传-1表示新增会话（系统自动生成ID），传已有ID表示更新该会话配置
约束条件：新增时每个域名最多10条会话规则
     * @param SessionID 会话ID
说明：传-1表示新增会话（系统自动生成ID），传已有ID表示更新该会话配置
约束条件：新增时每个域名最多10条会话规则
     */
    public void setSessionID(Long SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get 会话标识参数（精准匹配key）
入参限制：key中"."分隔的层级不超过2层
说明：当Category为exact_key时使用，表示要精确匹配的参数名 
     * @return Key 会话标识参数（精准匹配key）
入参限制：key中"."分隔的层级不超过2层
说明：当Category为exact_key时使用，表示要精确匹配的参数名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 会话标识参数（精准匹配key）
入参限制：key中"."分隔的层级不超过2层
说明：当Category为exact_key时使用，表示要精确匹配的参数名
     * @param Key 会话标识参数（精准匹配key）
入参限制：key中"."分隔的层级不超过2层
说明：当Category为exact_key时使用，表示要精确匹配的参数名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public UpsertSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertSessionRequest(UpsertSessionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.KeyOrStartMat != null) {
            this.KeyOrStartMat = new String(source.KeyOrStartMat);
        }
        if (source.EndMat != null) {
            this.EndMat = new String(source.EndMat);
        }
        if (source.StartOffset != null) {
            this.StartOffset = new String(source.StartOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new String(source.EndOffset);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.SessionID != null) {
            this.SessionID = new Long(source.SessionID);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "KeyOrStartMat", this.KeyOrStartMat);
        this.setParamSimple(map, prefix + "EndMat", this.EndMat);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

