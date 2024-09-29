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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicIdAndRegion extends AbstractModel {

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题id所在的地域id。

id,地域,简称信息如下：
- 1,   广州,ap-guangzhou
- 4,   上海,ap-shanghai
- 5,   中国香港,ap-hongkong
- 7,   上海金融,ap-shanghai-fsi
- 8,   北京,ap-beijing
- 9,   新加坡,ap-singapore
- 11,  深圳金融,ap-shenzhen-fsi
- 15,  硅谷,na-siliconvalley
- 16,  成都,ap-chengdu
- 17,  法兰克福,eu-frankfurt
- 18,  首尔,ap-seoul
- 19,  重庆,ap-chongqing
- 21,  孟买,ap-mumbai
- 22,  弗吉尼亚,na-ashburn
- 23,  曼谷,ap-bangkok
- 25,  东京,ap-tokyo
- 33,  南京,ap-nanjing
- 46,  北京金融,ap-beijing-fsi
- 72,  雅加达,ap-jakarta
- 74,  圣保罗,sa-saopaulo
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题id所在的地域id。

id,地域,简称信息如下：
- 1,   广州,ap-guangzhou
- 4,   上海,ap-shanghai
- 5,   中国香港,ap-hongkong
- 7,   上海金融,ap-shanghai-fsi
- 8,   北京,ap-beijing
- 9,   新加坡,ap-singapore
- 11,  深圳金融,ap-shenzhen-fsi
- 15,  硅谷,na-siliconvalley
- 16,  成都,ap-chengdu
- 17,  法兰克福,eu-frankfurt
- 18,  首尔,ap-seoul
- 19,  重庆,ap-chongqing
- 21,  孟买,ap-mumbai
- 22,  弗吉尼亚,na-ashburn
- 23,  曼谷,ap-bangkok
- 25,  东京,ap-tokyo
- 33,  南京,ap-nanjing
- 46,  北京金融,ap-beijing-fsi
- 72,  雅加达,ap-jakarta
- 74,  圣保罗,sa-saopaulo 
     * @return RegionId 日志主题id所在的地域id。

id,地域,简称信息如下：
- 1,   广州,ap-guangzhou
- 4,   上海,ap-shanghai
- 5,   中国香港,ap-hongkong
- 7,   上海金融,ap-shanghai-fsi
- 8,   北京,ap-beijing
- 9,   新加坡,ap-singapore
- 11,  深圳金融,ap-shenzhen-fsi
- 15,  硅谷,na-siliconvalley
- 16,  成都,ap-chengdu
- 17,  法兰克福,eu-frankfurt
- 18,  首尔,ap-seoul
- 19,  重庆,ap-chongqing
- 21,  孟买,ap-mumbai
- 22,  弗吉尼亚,na-ashburn
- 23,  曼谷,ap-bangkok
- 25,  东京,ap-tokyo
- 33,  南京,ap-nanjing
- 46,  北京金融,ap-beijing-fsi
- 72,  雅加达,ap-jakarta
- 74,  圣保罗,sa-saopaulo
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 日志主题id所在的地域id。

id,地域,简称信息如下：
- 1,   广州,ap-guangzhou
- 4,   上海,ap-shanghai
- 5,   中国香港,ap-hongkong
- 7,   上海金融,ap-shanghai-fsi
- 8,   北京,ap-beijing
- 9,   新加坡,ap-singapore
- 11,  深圳金融,ap-shenzhen-fsi
- 15,  硅谷,na-siliconvalley
- 16,  成都,ap-chengdu
- 17,  法兰克福,eu-frankfurt
- 18,  首尔,ap-seoul
- 19,  重庆,ap-chongqing
- 21,  孟买,ap-mumbai
- 22,  弗吉尼亚,na-ashburn
- 23,  曼谷,ap-bangkok
- 25,  东京,ap-tokyo
- 33,  南京,ap-nanjing
- 46,  北京金融,ap-beijing-fsi
- 72,  雅加达,ap-jakarta
- 74,  圣保罗,sa-saopaulo
     * @param RegionId 日志主题id所在的地域id。

id,地域,简称信息如下：
- 1,   广州,ap-guangzhou
- 4,   上海,ap-shanghai
- 5,   中国香港,ap-hongkong
- 7,   上海金融,ap-shanghai-fsi
- 8,   北京,ap-beijing
- 9,   新加坡,ap-singapore
- 11,  深圳金融,ap-shenzhen-fsi
- 15,  硅谷,na-siliconvalley
- 16,  成都,ap-chengdu
- 17,  法兰克福,eu-frankfurt
- 18,  首尔,ap-seoul
- 19,  重庆,ap-chongqing
- 21,  孟买,ap-mumbai
- 22,  弗吉尼亚,na-ashburn
- 23,  曼谷,ap-bangkok
- 25,  东京,ap-tokyo
- 33,  南京,ap-nanjing
- 46,  北京金融,ap-beijing-fsi
- 72,  雅加达,ap-jakarta
- 74,  圣保罗,sa-saopaulo
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public TopicIdAndRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicIdAndRegion(TopicIdAndRegion source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

