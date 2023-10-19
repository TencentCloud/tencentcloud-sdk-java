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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDownloadUrlRequest extends AbstractModel {

    /**
    * 账单类型，枚举值
billOverview=L0-PDF账单
billSummary=L1-汇总账单	
billResource=L2-资源账单	
billDetail=L3-明细账单	
billPack=账单包
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 账单月份
支持的最早开始月份为2021-01
L0-PDF&账单包不支持当月下载，当月账单请在次月1号19:00出账后下载
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN
    */
    @SerializedName("ChildUin")
    @Expose
    private String [] ChildUin;

    /**
     * Get 账单类型，枚举值
billOverview=L0-PDF账单
billSummary=L1-汇总账单	
billResource=L2-资源账单	
billDetail=L3-明细账单	
billPack=账单包 
     * @return FileType 账单类型，枚举值
billOverview=L0-PDF账单
billSummary=L1-汇总账单	
billResource=L2-资源账单	
billDetail=L3-明细账单	
billPack=账单包
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 账单类型，枚举值
billOverview=L0-PDF账单
billSummary=L1-汇总账单	
billResource=L2-资源账单	
billDetail=L3-明细账单	
billPack=账单包
     * @param FileType 账单类型，枚举值
billOverview=L0-PDF账单
billSummary=L1-汇总账单	
billResource=L2-资源账单	
billDetail=L3-明细账单	
billPack=账单包
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 账单月份
支持的最早开始月份为2021-01
L0-PDF&账单包不支持当月下载，当月账单请在次月1号19:00出账后下载 
     * @return Month 账单月份
支持的最早开始月份为2021-01
L0-PDF&账单包不支持当月下载，当月账单请在次月1号19:00出账后下载
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 账单月份
支持的最早开始月份为2021-01
L0-PDF&账单包不支持当月下载，当月账单请在次月1号19:00出账后下载
     * @param Month 账单月份
支持的最早开始月份为2021-01
L0-PDF&账单包不支持当月下载，当月账单请在次月1号19:00出账后下载
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN 
     * @return ChildUin 下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN
     */
    public String [] getChildUin() {
        return this.ChildUin;
    }

    /**
     * Set 下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN
     * @param ChildUin 下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN
     */
    public void setChildUin(String [] ChildUin) {
        this.ChildUin = ChildUin;
    }

    public DescribeBillDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDownloadUrlRequest(DescribeBillDownloadUrlRequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.ChildUin != null) {
            this.ChildUin = new String[source.ChildUin.length];
            for (int i = 0; i < source.ChildUin.length; i++) {
                this.ChildUin[i] = new String(source.ChildUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamArraySimple(map, prefix + "ChildUin.", this.ChildUin);

    }
}

