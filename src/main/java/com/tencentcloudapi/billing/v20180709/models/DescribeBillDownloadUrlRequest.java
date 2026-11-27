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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDownloadUrlRequest extends AbstractModel {

    /**
    * <p>账单类型，枚举值<br>billOverview=L0-PDF账单<br>billSummary=L1-汇总账单<br>billResource=L2-资源账单<br>billDetail=L3-明细账单<br>billPack=账单包</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>月份，格式为yyyy-mm，不能早于2021-01  示例值：2026-11</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN</p>
    */
    @SerializedName("ChildUin")
    @Expose
    private String [] ChildUin;

    /**
     * Get <p>账单类型，枚举值<br>billOverview=L0-PDF账单<br>billSummary=L1-汇总账单<br>billResource=L2-资源账单<br>billDetail=L3-明细账单<br>billPack=账单包</p> 
     * @return FileType <p>账单类型，枚举值<br>billOverview=L0-PDF账单<br>billSummary=L1-汇总账单<br>billResource=L2-资源账单<br>billDetail=L3-明细账单<br>billPack=账单包</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>账单类型，枚举值<br>billOverview=L0-PDF账单<br>billSummary=L1-汇总账单<br>billResource=L2-资源账单<br>billDetail=L3-明细账单<br>billPack=账单包</p>
     * @param FileType <p>账单类型，枚举值<br>billOverview=L0-PDF账单<br>billSummary=L1-汇总账单<br>billResource=L2-资源账单<br>billDetail=L3-明细账单<br>billPack=账单包</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>月份，格式为yyyy-mm，不能早于2021-01  示例值：2026-11</p> 
     * @return Month <p>月份，格式为yyyy-mm，不能早于2021-01  示例值：2026-11</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>月份，格式为yyyy-mm，不能早于2021-01  示例值：2026-11</p>
     * @param Month <p>月份，格式为yyyy-mm，不能早于2021-01  示例值：2026-11</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN</p> 
     * @return ChildUin <p>下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN</p>
     */
    public String [] getChildUin() {
        return this.ChildUin;
    }

    /**
     * Set <p>下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN</p>
     * @param ChildUin <p>下载的账号 ID列表，默认查询本账号账单，如集团管理账号需下载成员账号自付的账单，该字段需入参成员账号UIN</p>
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

