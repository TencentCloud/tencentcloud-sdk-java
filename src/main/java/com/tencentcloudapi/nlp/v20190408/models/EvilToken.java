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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvilToken  extends AbstractModel{

    /**
    * 文本是否恶意：
0、正常；
1、恶意；
2、可疑送审
    */
    @SerializedName("EvilFlag")
    @Expose
    private Long EvilFlag;

    /**
    * 恶意关键词组
    */
    @SerializedName("EvilKeywords")
    @Expose
    private String [] EvilKeywords;

    /**
    * 文本恶意类型：
0、正常；
1、政治；
2、色情；
3、辱骂/低俗；
4、暴恐/毒品；
5、广告/灌水；
6、迷信/邪教；
7、其他违法（如跨站追杀/恶意竞争等）；
8、综合
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
     * 获取文本是否恶意：
0、正常；
1、恶意；
2、可疑送审
     * @return EvilFlag 文本是否恶意：
0、正常；
1、恶意；
2、可疑送审
     */
    public Long getEvilFlag() {
        return this.EvilFlag;
    }

    /**
     * 设置文本是否恶意：
0、正常；
1、恶意；
2、可疑送审
     * @param EvilFlag 文本是否恶意：
0、正常；
1、恶意；
2、可疑送审
     */
    public void setEvilFlag(Long EvilFlag) {
        this.EvilFlag = EvilFlag;
    }

    /**
     * 获取恶意关键词组
     * @return EvilKeywords 恶意关键词组
     */
    public String [] getEvilKeywords() {
        return this.EvilKeywords;
    }

    /**
     * 设置恶意关键词组
     * @param EvilKeywords 恶意关键词组
     */
    public void setEvilKeywords(String [] EvilKeywords) {
        this.EvilKeywords = EvilKeywords;
    }

    /**
     * 获取文本恶意类型：
0、正常；
1、政治；
2、色情；
3、辱骂/低俗；
4、暴恐/毒品；
5、广告/灌水；
6、迷信/邪教；
7、其他违法（如跨站追杀/恶意竞争等）；
8、综合
     * @return EvilType 文本恶意类型：
0、正常；
1、政治；
2、色情；
3、辱骂/低俗；
4、暴恐/毒品；
5、广告/灌水；
6、迷信/邪教；
7、其他违法（如跨站追杀/恶意竞争等）；
8、综合
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * 设置文本恶意类型：
0、正常；
1、政治；
2、色情；
3、辱骂/低俗；
4、暴恐/毒品；
5、广告/灌水；
6、迷信/邪教；
7、其他违法（如跨站追杀/恶意竞争等）；
8、综合
     * @param EvilType 文本恶意类型：
0、正常；
1、政治；
2、色情；
3、辱骂/低俗；
4、暴恐/毒品；
5、广告/灌水；
6、迷信/邪教；
7、其他违法（如跨站追杀/恶意竞争等）；
8、综合
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilFlag", this.EvilFlag);
        this.setParamArraySimple(map, prefix + "EvilKeywords.", this.EvilKeywords);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);

    }
}

