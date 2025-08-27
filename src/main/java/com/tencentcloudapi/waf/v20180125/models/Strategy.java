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

public class Strategy extends AbstractModel {

    /**
    * 匹配字段

    匹配字段不同，相应的匹配参数、逻辑符号、匹配内容有所不同具体如下所示：
<table><thead><tr><th>匹配字段</th><th>匹配参数</th><th>逻辑符号</th><th>匹配内容</th></tr></thead><tbody><tr><td>IP（来源IP）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>多个IP以英文逗号隔开,最多20个</td></tr><tr><td>IPV6（来源IPv6）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>支持单个IPV6地址</td></tr><tr><td>Referer（Referer）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>URL（请求路径）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）<br/></td><td>请以/开头,512个字符以内</td></tr><tr><td>UserAgent（UserAgent）</td><td>不支持参数</td><td>同匹配字段<font color="Red">Referer</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>HTTP_METHOD（HTTP请求方法）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）</td><td>请输入方法名称,建议大写</td></tr><tr><td>QUERY_STRING（请求字符串）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET（GET参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_PARAMS_NAMES（GET参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST（POST参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_POST_NAMES（POST参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST_BODY（完整BODY）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入BODY内容,512个字符以内</td></tr><tr><td>COOKIE（Cookie）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>rematch（正则匹配）</td><td><font color="Red">暂不支持</font></td></tr><tr><td>GET_COOKIES_NAMES（Cookie参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>ARGS_COOKIE（Cookie参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_HEADERS_NAMES（Header参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,建议小写,512个字符以内</td></tr><tr><td>ARGS_HEADER（Header参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>CONTENT_LENGTH（Content-length）</td><td>支持参数录入</td><td>numgt（数值大于）<br/>numlt（数值小于）<br/>numeq（数值等于）<br/></td><td>请输入0-9999999999999之间的整数</td></tr><tr><td>IP_GEO（来源IP归属地）</td><td>支持参数录入</td><td>geo_in（属于）<br/>geo_not_in（不属于）<br/></td><td>请输入内容,10240字符以内，格式为序列化的JSON，格式为：[{"Country":"中国","Region":"广东","City":"深圳"}]</td></tr><tr><td>CAPTCHA_RISK（验证码风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入风险等级值,支持数值范围0-255</td></tr><tr><td>CAPTCHA_DEVICE_RISK（验证码设备风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入设备风险代码,支持取值：101、201、301、401、501、601、701</td></tr><tr><td>CAPTCHAR_SCORE（验证码风险评估分）</td><td>不支持参数</td><td>numeq（数值等于）<br/>numgt（数值大于）<br/>numlt（数值小于）<br/>numle（数值小于等于）<br/>numge（数值大于等于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入评估分数,支持数值范围0-100</td></tr>
</tbody></table>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 逻辑符号 

    逻辑符号一共分为以下几种类型：
        empty （ 内容为空）
        null （不存在）
        eq （ 等于）
        neq （ 不等于）
        contains （ 包含）
        ncontains （ 不包含）
        strprefix （ 前缀匹配）
        strsuffix （ 后缀匹配）
        len_eq （ 长度等于）
        len_gt （ 长度大于）
        len_lt （ 长度小于）
        ipmatch （ 属于）
        ipnmatch （ 不属于）
        numgt （ 数值大于）
        numlt （ 数值小于）
        numeq （ 数值等于）
        numneq （ 数值不等于）
        numle （ 数值小于等于）
        numge （ 数值大于等于）
        geo_in （ IP地理属于）
        geo_not_in （ IP地理不属于）
    各匹配字段对应的逻辑符号不同，详见上述匹配字段表格
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * 匹配内容

    目前 当匹配字段为COOKIE（Cookie）时，不需要输入 匹配内容其他都需要

    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 匹配参数

    配置参数一共分2种类型 不支持参数与支持参数
    当匹配字段为以下4个时，匹配参数才能录入，否则不支持该参数
        GET（GET参数值）		
        POST（POST参数值）		
        ARGS_COOKIE（Cookie参数值）		
        ARGS_HEADER（Header参数值）

    */
    @SerializedName("Arg")
    @Expose
    private String Arg;

    /**
    * 0：大小写敏感
1：大小写不敏感
    */
    @SerializedName("CaseNotSensitive")
    @Expose
    private Long CaseNotSensitive;

    /**
     * Get 匹配字段

    匹配字段不同，相应的匹配参数、逻辑符号、匹配内容有所不同具体如下所示：
<table><thead><tr><th>匹配字段</th><th>匹配参数</th><th>逻辑符号</th><th>匹配内容</th></tr></thead><tbody><tr><td>IP（来源IP）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>多个IP以英文逗号隔开,最多20个</td></tr><tr><td>IPV6（来源IPv6）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>支持单个IPV6地址</td></tr><tr><td>Referer（Referer）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>URL（请求路径）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）<br/></td><td>请以/开头,512个字符以内</td></tr><tr><td>UserAgent（UserAgent）</td><td>不支持参数</td><td>同匹配字段<font color="Red">Referer</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>HTTP_METHOD（HTTP请求方法）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）</td><td>请输入方法名称,建议大写</td></tr><tr><td>QUERY_STRING（请求字符串）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET（GET参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_PARAMS_NAMES（GET参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST（POST参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_POST_NAMES（POST参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST_BODY（完整BODY）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入BODY内容,512个字符以内</td></tr><tr><td>COOKIE（Cookie）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>rematch（正则匹配）</td><td><font color="Red">暂不支持</font></td></tr><tr><td>GET_COOKIES_NAMES（Cookie参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>ARGS_COOKIE（Cookie参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_HEADERS_NAMES（Header参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,建议小写,512个字符以内</td></tr><tr><td>ARGS_HEADER（Header参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>CONTENT_LENGTH（Content-length）</td><td>支持参数录入</td><td>numgt（数值大于）<br/>numlt（数值小于）<br/>numeq（数值等于）<br/></td><td>请输入0-9999999999999之间的整数</td></tr><tr><td>IP_GEO（来源IP归属地）</td><td>支持参数录入</td><td>geo_in（属于）<br/>geo_not_in（不属于）<br/></td><td>请输入内容,10240字符以内，格式为序列化的JSON，格式为：[{"Country":"中国","Region":"广东","City":"深圳"}]</td></tr><tr><td>CAPTCHA_RISK（验证码风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入风险等级值,支持数值范围0-255</td></tr><tr><td>CAPTCHA_DEVICE_RISK（验证码设备风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入设备风险代码,支持取值：101、201、301、401、501、601、701</td></tr><tr><td>CAPTCHAR_SCORE（验证码风险评估分）</td><td>不支持参数</td><td>numeq（数值等于）<br/>numgt（数值大于）<br/>numlt（数值小于）<br/>numle（数值小于等于）<br/>numge（数值大于等于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入评估分数,支持数值范围0-100</td></tr>
</tbody></table> 
     * @return Field 匹配字段

    匹配字段不同，相应的匹配参数、逻辑符号、匹配内容有所不同具体如下所示：
<table><thead><tr><th>匹配字段</th><th>匹配参数</th><th>逻辑符号</th><th>匹配内容</th></tr></thead><tbody><tr><td>IP（来源IP）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>多个IP以英文逗号隔开,最多20个</td></tr><tr><td>IPV6（来源IPv6）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>支持单个IPV6地址</td></tr><tr><td>Referer（Referer）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>URL（请求路径）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）<br/></td><td>请以/开头,512个字符以内</td></tr><tr><td>UserAgent（UserAgent）</td><td>不支持参数</td><td>同匹配字段<font color="Red">Referer</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>HTTP_METHOD（HTTP请求方法）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）</td><td>请输入方法名称,建议大写</td></tr><tr><td>QUERY_STRING（请求字符串）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET（GET参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_PARAMS_NAMES（GET参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST（POST参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_POST_NAMES（POST参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST_BODY（完整BODY）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入BODY内容,512个字符以内</td></tr><tr><td>COOKIE（Cookie）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>rematch（正则匹配）</td><td><font color="Red">暂不支持</font></td></tr><tr><td>GET_COOKIES_NAMES（Cookie参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>ARGS_COOKIE（Cookie参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_HEADERS_NAMES（Header参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,建议小写,512个字符以内</td></tr><tr><td>ARGS_HEADER（Header参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>CONTENT_LENGTH（Content-length）</td><td>支持参数录入</td><td>numgt（数值大于）<br/>numlt（数值小于）<br/>numeq（数值等于）<br/></td><td>请输入0-9999999999999之间的整数</td></tr><tr><td>IP_GEO（来源IP归属地）</td><td>支持参数录入</td><td>geo_in（属于）<br/>geo_not_in（不属于）<br/></td><td>请输入内容,10240字符以内，格式为序列化的JSON，格式为：[{"Country":"中国","Region":"广东","City":"深圳"}]</td></tr><tr><td>CAPTCHA_RISK（验证码风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入风险等级值,支持数值范围0-255</td></tr><tr><td>CAPTCHA_DEVICE_RISK（验证码设备风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入设备风险代码,支持取值：101、201、301、401、501、601、701</td></tr><tr><td>CAPTCHAR_SCORE（验证码风险评估分）</td><td>不支持参数</td><td>numeq（数值等于）<br/>numgt（数值大于）<br/>numlt（数值小于）<br/>numle（数值小于等于）<br/>numge（数值大于等于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入评估分数,支持数值范围0-100</td></tr>
</tbody></table>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 匹配字段

    匹配字段不同，相应的匹配参数、逻辑符号、匹配内容有所不同具体如下所示：
<table><thead><tr><th>匹配字段</th><th>匹配参数</th><th>逻辑符号</th><th>匹配内容</th></tr></thead><tbody><tr><td>IP（来源IP）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>多个IP以英文逗号隔开,最多20个</td></tr><tr><td>IPV6（来源IPv6）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>支持单个IPV6地址</td></tr><tr><td>Referer（Referer）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>URL（请求路径）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）<br/></td><td>请以/开头,512个字符以内</td></tr><tr><td>UserAgent（UserAgent）</td><td>不支持参数</td><td>同匹配字段<font color="Red">Referer</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>HTTP_METHOD（HTTP请求方法）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）</td><td>请输入方法名称,建议大写</td></tr><tr><td>QUERY_STRING（请求字符串）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET（GET参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_PARAMS_NAMES（GET参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST（POST参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_POST_NAMES（POST参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST_BODY（完整BODY）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入BODY内容,512个字符以内</td></tr><tr><td>COOKIE（Cookie）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>rematch（正则匹配）</td><td><font color="Red">暂不支持</font></td></tr><tr><td>GET_COOKIES_NAMES（Cookie参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>ARGS_COOKIE（Cookie参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_HEADERS_NAMES（Header参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,建议小写,512个字符以内</td></tr><tr><td>ARGS_HEADER（Header参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>CONTENT_LENGTH（Content-length）</td><td>支持参数录入</td><td>numgt（数值大于）<br/>numlt（数值小于）<br/>numeq（数值等于）<br/></td><td>请输入0-9999999999999之间的整数</td></tr><tr><td>IP_GEO（来源IP归属地）</td><td>支持参数录入</td><td>geo_in（属于）<br/>geo_not_in（不属于）<br/></td><td>请输入内容,10240字符以内，格式为序列化的JSON，格式为：[{"Country":"中国","Region":"广东","City":"深圳"}]</td></tr><tr><td>CAPTCHA_RISK（验证码风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入风险等级值,支持数值范围0-255</td></tr><tr><td>CAPTCHA_DEVICE_RISK（验证码设备风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入设备风险代码,支持取值：101、201、301、401、501、601、701</td></tr><tr><td>CAPTCHAR_SCORE（验证码风险评估分）</td><td>不支持参数</td><td>numeq（数值等于）<br/>numgt（数值大于）<br/>numlt（数值小于）<br/>numle（数值小于等于）<br/>numge（数值大于等于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入评估分数,支持数值范围0-100</td></tr>
</tbody></table>
     * @param Field 匹配字段

    匹配字段不同，相应的匹配参数、逻辑符号、匹配内容有所不同具体如下所示：
<table><thead><tr><th>匹配字段</th><th>匹配参数</th><th>逻辑符号</th><th>匹配内容</th></tr></thead><tbody><tr><td>IP（来源IP）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>多个IP以英文逗号隔开,最多20个</td></tr><tr><td>IPV6（来源IPv6）</td><td>不支持参数</td><td>ipmatch（匹配）<br/>ipnmatch（不匹配）</td><td>支持单个IPV6地址</td></tr><tr><td>Referer（Referer）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>URL（请求路径）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）<br/></td><td>请以/开头,512个字符以内</td></tr><tr><td>UserAgent（UserAgent）</td><td>不支持参数</td><td>同匹配字段<font color="Red">Referer</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>HTTP_METHOD（HTTP请求方法）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）</td><td>请输入方法名称,建议大写</td></tr><tr><td>QUERY_STRING（请求字符串）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET（GET参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_PARAMS_NAMES（GET参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST（POST参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_POST_NAMES（POST参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>POST_BODY（完整BODY）</td><td>不支持参数</td><td>同匹配字段<font color="Red">请求路径</font>逻辑符号</td><td>请输入BODY内容,512个字符以内</td></tr><tr><td>COOKIE（Cookie）</td><td>不支持参数</td><td>empty（内容为空）<br/>null（不存在）<br/>rematch（正则匹配）</td><td><font color="Red">暂不支持</font></td></tr><tr><td>GET_COOKIES_NAMES（Cookie参数名）</td><td>不支持参数</td><td>同匹配字段<font color="Red">GET参数名</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>ARGS_COOKIE（Cookie参数值）</td><td>支持参数录入</td><td>同匹配字段<font color="Red">GET参数值</font>逻辑符号</td><td>请输入内容,512个字符以内</td></tr><tr><td>GET_HEADERS_NAMES（Header参数名）</td><td>不支持参数</td><td>exsit（存在参数）<br/>nexsit（不存在参数）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,建议小写,512个字符以内</td></tr><tr><td>ARGS_HEADER（Header参数值）</td><td>支持参数录入</td><td>contains（包含）<br/>ncontains（不包含）<br/>len_eq（长度等于）<br/>len_gt（长度大于）<br/>len_lt（长度小于）<br/>strprefix（前缀匹配）<br/>strsuffix（后缀匹配）<br/>rematch（正则匹配）</td><td>请输入内容,512个字符以内</td></tr><tr><td>CONTENT_LENGTH（Content-length）</td><td>支持参数录入</td><td>numgt（数值大于）<br/>numlt（数值小于）<br/>numeq（数值等于）<br/></td><td>请输入0-9999999999999之间的整数</td></tr><tr><td>IP_GEO（来源IP归属地）</td><td>支持参数录入</td><td>geo_in（属于）<br/>geo_not_in（不属于）<br/></td><td>请输入内容,10240字符以内，格式为序列化的JSON，格式为：[{"Country":"中国","Region":"广东","City":"深圳"}]</td></tr><tr><td>CAPTCHA_RISK（验证码风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入风险等级值,支持数值范围0-255</td></tr><tr><td>CAPTCHA_DEVICE_RISK（验证码设备风险）</td><td>不支持参数</td><td>eq（等于）<br/>neq（不等于）<br/>belong（属于）<br/>not_belong（不属于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入设备风险代码,支持取值：101、201、301、401、501、601、701</td></tr><tr><td>CAPTCHAR_SCORE（验证码风险评估分）</td><td>不支持参数</td><td>numeq（数值等于）<br/>numgt（数值大于）<br/>numlt（数值小于）<br/>numle（数值小于等于）<br/>numge（数值大于等于）<br/>null（不存在）<br/>exist（存在）</td><td>请输入评估分数,支持数值范围0-100</td></tr>
</tbody></table>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 逻辑符号 

    逻辑符号一共分为以下几种类型：
        empty （ 内容为空）
        null （不存在）
        eq （ 等于）
        neq （ 不等于）
        contains （ 包含）
        ncontains （ 不包含）
        strprefix （ 前缀匹配）
        strsuffix （ 后缀匹配）
        len_eq （ 长度等于）
        len_gt （ 长度大于）
        len_lt （ 长度小于）
        ipmatch （ 属于）
        ipnmatch （ 不属于）
        numgt （ 数值大于）
        numlt （ 数值小于）
        numeq （ 数值等于）
        numneq （ 数值不等于）
        numle （ 数值小于等于）
        numge （ 数值大于等于）
        geo_in （ IP地理属于）
        geo_not_in （ IP地理不属于）
    各匹配字段对应的逻辑符号不同，详见上述匹配字段表格 
     * @return CompareFunc 逻辑符号 

    逻辑符号一共分为以下几种类型：
        empty （ 内容为空）
        null （不存在）
        eq （ 等于）
        neq （ 不等于）
        contains （ 包含）
        ncontains （ 不包含）
        strprefix （ 前缀匹配）
        strsuffix （ 后缀匹配）
        len_eq （ 长度等于）
        len_gt （ 长度大于）
        len_lt （ 长度小于）
        ipmatch （ 属于）
        ipnmatch （ 不属于）
        numgt （ 数值大于）
        numlt （ 数值小于）
        numeq （ 数值等于）
        numneq （ 数值不等于）
        numle （ 数值小于等于）
        numge （ 数值大于等于）
        geo_in （ IP地理属于）
        geo_not_in （ IP地理不属于）
    各匹配字段对应的逻辑符号不同，详见上述匹配字段表格
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set 逻辑符号 

    逻辑符号一共分为以下几种类型：
        empty （ 内容为空）
        null （不存在）
        eq （ 等于）
        neq （ 不等于）
        contains （ 包含）
        ncontains （ 不包含）
        strprefix （ 前缀匹配）
        strsuffix （ 后缀匹配）
        len_eq （ 长度等于）
        len_gt （ 长度大于）
        len_lt （ 长度小于）
        ipmatch （ 属于）
        ipnmatch （ 不属于）
        numgt （ 数值大于）
        numlt （ 数值小于）
        numeq （ 数值等于）
        numneq （ 数值不等于）
        numle （ 数值小于等于）
        numge （ 数值大于等于）
        geo_in （ IP地理属于）
        geo_not_in （ IP地理不属于）
    各匹配字段对应的逻辑符号不同，详见上述匹配字段表格
     * @param CompareFunc 逻辑符号 

    逻辑符号一共分为以下几种类型：
        empty （ 内容为空）
        null （不存在）
        eq （ 等于）
        neq （ 不等于）
        contains （ 包含）
        ncontains （ 不包含）
        strprefix （ 前缀匹配）
        strsuffix （ 后缀匹配）
        len_eq （ 长度等于）
        len_gt （ 长度大于）
        len_lt （ 长度小于）
        ipmatch （ 属于）
        ipnmatch （ 不属于）
        numgt （ 数值大于）
        numlt （ 数值小于）
        numeq （ 数值等于）
        numneq （ 数值不等于）
        numle （ 数值小于等于）
        numge （ 数值大于等于）
        geo_in （ IP地理属于）
        geo_not_in （ IP地理不属于）
    各匹配字段对应的逻辑符号不同，详见上述匹配字段表格
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get 匹配内容

    目前 当匹配字段为COOKIE（Cookie）时，不需要输入 匹配内容其他都需要
 
     * @return Content 匹配内容

    目前 当匹配字段为COOKIE（Cookie）时，不需要输入 匹配内容其他都需要

     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 匹配内容

    目前 当匹配字段为COOKIE（Cookie）时，不需要输入 匹配内容其他都需要

     * @param Content 匹配内容

    目前 当匹配字段为COOKIE（Cookie）时，不需要输入 匹配内容其他都需要

     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 匹配参数

    配置参数一共分2种类型 不支持参数与支持参数
    当匹配字段为以下4个时，匹配参数才能录入，否则不支持该参数
        GET（GET参数值）		
        POST（POST参数值）		
        ARGS_COOKIE（Cookie参数值）		
        ARGS_HEADER（Header参数值）
 
     * @return Arg 匹配参数

    配置参数一共分2种类型 不支持参数与支持参数
    当匹配字段为以下4个时，匹配参数才能录入，否则不支持该参数
        GET（GET参数值）		
        POST（POST参数值）		
        ARGS_COOKIE（Cookie参数值）		
        ARGS_HEADER（Header参数值）

     */
    public String getArg() {
        return this.Arg;
    }

    /**
     * Set 匹配参数

    配置参数一共分2种类型 不支持参数与支持参数
    当匹配字段为以下4个时，匹配参数才能录入，否则不支持该参数
        GET（GET参数值）		
        POST（POST参数值）		
        ARGS_COOKIE（Cookie参数值）		
        ARGS_HEADER（Header参数值）

     * @param Arg 匹配参数

    配置参数一共分2种类型 不支持参数与支持参数
    当匹配字段为以下4个时，匹配参数才能录入，否则不支持该参数
        GET（GET参数值）		
        POST（POST参数值）		
        ARGS_COOKIE（Cookie参数值）		
        ARGS_HEADER（Header参数值）

     */
    public void setArg(String Arg) {
        this.Arg = Arg;
    }

    /**
     * Get 0：大小写敏感
1：大小写不敏感 
     * @return CaseNotSensitive 0：大小写敏感
1：大小写不敏感
     */
    public Long getCaseNotSensitive() {
        return this.CaseNotSensitive;
    }

    /**
     * Set 0：大小写敏感
1：大小写不敏感
     * @param CaseNotSensitive 0：大小写敏感
1：大小写不敏感
     */
    public void setCaseNotSensitive(Long CaseNotSensitive) {
        this.CaseNotSensitive = CaseNotSensitive;
    }

    public Strategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategy(Strategy source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.CompareFunc != null) {
            this.CompareFunc = new String(source.CompareFunc);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Arg != null) {
            this.Arg = new String(source.Arg);
        }
        if (source.CaseNotSensitive != null) {
            this.CaseNotSensitive = new Long(source.CaseNotSensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "CompareFunc", this.CompareFunc);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Arg", this.Arg);
        this.setParamSimple(map, prefix + "CaseNotSensitive", this.CaseNotSensitive);

    }
}

