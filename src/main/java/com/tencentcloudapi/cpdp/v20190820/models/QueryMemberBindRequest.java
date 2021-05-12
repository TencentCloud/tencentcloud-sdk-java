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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMemberBindRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(4)，查询标志（1: 全部会员; 2: 单个会员; 3: 单个会员的证件信息）
    */
    @SerializedName("QueryFlag")
    @Expose
    private String QueryFlag;

    /**
    * STRING (10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
    */
    @SerializedName("PageNum")
    @Expose
    private String PageNum;

    /**
    * STRING(50)，见证子账户的账号（若SelectFlag为2或3时，子账户账号必输）
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(4)，查询标志（1: 全部会员; 2: 单个会员; 3: 单个会员的证件信息） 
     * @return QueryFlag STRING(4)，查询标志（1: 全部会员; 2: 单个会员; 3: 单个会员的证件信息）
     */
    public String getQueryFlag() {
        return this.QueryFlag;
    }

    /**
     * Set STRING(4)，查询标志（1: 全部会员; 2: 单个会员; 3: 单个会员的证件信息）
     * @param QueryFlag STRING(4)，查询标志（1: 全部会员; 2: 单个会员; 3: 单个会员的证件信息）
     */
    public void setQueryFlag(String QueryFlag) {
        this.QueryFlag = QueryFlag;
    }

    /**
     * Get STRING (10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后） 
     * @return PageNum STRING (10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
     */
    public String getPageNum() {
        return this.PageNum;
    }

    /**
     * Set STRING (10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
     * @param PageNum STRING (10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
     */
    public void setPageNum(String PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get STRING(50)，见证子账户的账号（若SelectFlag为2或3时，子账户账号必输） 
     * @return SubAcctNo STRING(50)，见证子账户的账号（若SelectFlag为2或3时，子账户账号必输）
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子账户的账号（若SelectFlag为2或3时，子账户账号必输）
     * @param SubAcctNo STRING(50)，见证子账户的账号（若SelectFlag为2或3时，子账户账号必输）
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Get STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod" 
     * @return Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     * @param Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QueryMemberBindRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMemberBindRequest(QueryMemberBindRequest source) {
        if (source.MrchCode != null) {
            this.MrchCode = new String(source.MrchCode);
        }
        if (source.QueryFlag != null) {
            this.QueryFlag = new String(source.QueryFlag);
        }
        if (source.PageNum != null) {
            this.PageNum = new String(source.PageNum);
        }
        if (source.SubAcctNo != null) {
            this.SubAcctNo = new String(source.SubAcctNo);
        }
        if (source.ReservedMsg != null) {
            this.ReservedMsg = new String(source.ReservedMsg);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "QueryFlag", this.QueryFlag);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

