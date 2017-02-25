'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

const ScreenOne = (props) => {
    return (
      <View style={styles.container}>
        <Text style={styles.screen}>Screen One</Text>
      </View>
    )
};

const ScreenTwo = (props) => {
    return (
      <View style={styles.container}>
        <Text style={styles.screen}>Screen Two</Text>
      </View>
    )
};

var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  screen: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

AppRegistry.registerComponent('ScreenOne', () => ScreenOne);
AppRegistry.registerComponent('ScreenTwo', () => ScreenTwo);
