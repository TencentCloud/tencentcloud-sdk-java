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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenProtection extends AbstractModel {

    /**
    * 类型值：文件查杀，暴力破解，漏洞扫描，基线检测
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件查杀:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险；
暴力破解: 0:未开启防护（0付费资产情况）1:已开启自动阻断；
漏洞扫描: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险；
基线检测: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险；
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 类型值：文件查杀，暴力破解，漏洞扫描，基线检测 
     * @return Name 类型值：文件查杀，暴力破解，漏洞扫描，基线检测
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型值：文件查杀，暴力破解，漏洞扫描，基线检测
     * @param Name 类型值：文件查杀，暴力破解，漏洞扫描，基线检测
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件查杀:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险；
暴力破解: 0:未开启防护（0付费资产情况）1:已开启自动阻断；
漏洞扫描: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险；
基线检测: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险； 
     * @return Status 文件查杀:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险；
暴力破解: 0:未开启防护（0付费资产情况）1:已开启自动阻断；
漏洞扫描: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险；
基线检测: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险；
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 文件查杀:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险；
暴力破解: 0:未开启防护（0付费资产情况）1:已开启自动阻断；
漏洞扫描: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险；
基线检测: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险；
     * @param Status 文件查杀:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险；
暴力破解: 0:未开启防护（0付费资产情况）1:已开启自动阻断；
漏洞扫描: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险；
基线检测: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险；
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ScreenProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenProtection(ScreenProtection source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

